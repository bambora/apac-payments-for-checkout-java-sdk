/**
 * 888                             888
 * 888                             888
 * 88888b.   8888b.  88888b.d88b.  88888b.   .d88b.  888d888  8888b.
 * 888 "88b     "88b 888 "888 "88b 888 "88b d88""88b 888P"       "88b
 * 888  888 .d888888 888  888  888 888  888 888  888 888     .d888888
 * 888 d88P 888  888 888  888  888 888 d88P Y88..88P 888     888  888
 * 88888P"  "Y888888 888  888  888 88888P"   "Y88P"  888     "Y888888
 *
 * @category    Checkout java SDK
 * @package     apac-payments-for-checkout-java-sdk
 * @author      Bambora Online APAC
 * @copyright   Bambora (http://bambora.com)
 */
package com.bambora;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;

/**
 * An API client for accessing the payment gateway for session initiation request and payment URL retrieval.
 */
public class Client {
    private static Log log = LogFactory.getLog(Client.class);

    private URI endpointUri; // Bambora Server URI

    private String userName; // API username and password and DL

    private String password;

    private String dL;

    /**
     * Client Constructor for creating a Client instance.
     * @param userName the API username supplied by IPP
     * @param password the API password supplied by IPP
     * @param dL the value specifies the styling and functionality. It is supplied by Bambora
     * @param endPoint the IPP service endpoint
     */
    public Client(String userName, String password, String dL, EndPoint endPoint) throws ClientException {
        this.userName = userName;
        this.password = password;
        this.dL = dL;
        this.endpointUri = endPoint.getUri();
        if (userName == null || userName.length() == 0 || userName.length() > 32) {
            throw new ClientException("Username is mandatory and max length is 32 characters");
        }
        if (password == null || password.length() == 0 || password.length() > 16) {
            throw new ClientException("Password is mandatory and max length is 16 characters");
        }
        if (dL == null || dL.length() == 0 || dL.length() > 32) {
            throw new ClientException("DL is mandatory and max length is 32 characters");
        }
    }

    /**
     * Initiate a service session and get a session token for use in subsequent requests.
     * @param requestObject a session initiation object
     * @return a session token for use in subsequent requests
     * @throws ClientException on failure
     */
    public String getSessionToken(SessionInitiationRequestObject requestObject) throws ClientException {
        log.debug("getSessionToken");
        if (requestObject == null) {
            throw new ClientException("request object SessionInitiationRequestObject is null");
        }
        log.debug(requestObject.toString());
        StringBuilder formData = sessInitReqObjectToFormData(requestObject);
        Document doc = null;
        try {
            log.debug(formData.toString());
            String postResults = sendPost(formData.toString());
            log.debug(postResults != null ? postResults.toString() : "postResults is null");
            doc = Jsoup.parse(postResults);
        } catch (Exception e) {
            throw new ClientException(e.toString());
        }
        String sessionToken = doc.select("input[name=SST]").attr("value");
        Boolean sessionStored = Boolean.valueOf(doc.select("input[name=SessionStored]").attr("value"));
        String sessionStoredError = doc.select("input[name=SessionStoredError]").attr("value");
        if (sessionStored && sessionStoredError.length() == 0) {
            return sessionToken;
        } else {
            throw new ClientException(sessionStoredError);
        }
    }

    /**
     * Get the service payment form URL for inclusion in client such as iFrame. The sessionID and secureSessionToken
     * is one-use only so subsequent request will result in error.
     * @param sessionID your identifier of a user session
     * @param secureSessionToken a token previously return by IP Payments
     * @return The payment form URL
     */
    public String getPaymentFormUrl(String sessionID, String secureSessionToken) {
        return endpointUri + "?SessionId=" + sessionID + "&SST=" + secureSessionToken;
    }

    /**
     * toStringWithoutDot method. Converts BigDecimal to string without the decimal.
     * @param amount is a BigDecimal object. I.e. new BigDecimal(299.95)
     * @return the amount in cents as a string. I.e. "29995"
     */
    static String toStringWithoutDot(BigDecimal amount) {
        return amount.setScale(2, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)).toBigInteger().toString();
    }

    private StringBuilder sessInitReqObjectToFormData(SessionInitiationRequestObject requestObject) {
        StringBuilder formData = new StringBuilder();
        formData.append("UserName=" + userName);
        formData.append("&Password=" + password);
        formData.append("&DL=" + dL);
        formData.append("&Amount=" + toStringWithoutDot(requestObject.getAmount()));
        formData.append("&SessionID=" + requestObject.getSessionID());
        formData.append("&SessionKey=" + requestObject.getSessionKey());
        formData.append("&ServerURL=" + requestObject.getServerURL());
        formData.append("&UserURL=" + requestObject.getUserURL());
        formData.append("&CustRef=" + requestObject.getCustRef());
        if (requestObject.getAccountNumber() != null) formData.append("&AccountNumber=" + requestObject.getAccountNumber());
        if (requestObject.getCustNumber() != null) formData.append("&CustNumber=" + requestObject.getCustNumber());
        if (requestObject.getEmail() != null) formData.append("&Email=" + requestObject.getEmail());
        if (requestObject.getReference1() != null) formData.append("&Reference1=" + requestObject.getReference1());
        if (requestObject.getReference2() != null) formData.append("&Reference2=" + requestObject.getReference2());
        if (requestObject.getReference3() != null) formData.append("&Reference3=" + requestObject.getReference3());
        if (requestObject.getReference4() != null) formData.append("&Reference4=" + requestObject.getReference4());
        if (requestObject.getReference5() != null) formData.append("&Reference5=" + requestObject.getReference5());
        if (requestObject.getStyleName() != null) formData.append("&Stylename=" + requestObject.getStyleName());
        if (requestObject.getUserDeclinedURL() != null) formData.append("&UserDeclinedURL=" + requestObject.getUserDeclinedURL());
        if (requestObject.getCustomerStorageNumber() != null) formData.append("&CustomerStorageNumber=" + requestObject.getCustomerStorageNumber());
        return formData;
    }

    private String sendPost(String urlParameters) throws Exception {

        URL obj = endpointUri.toURL();
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        log.debug("Sending 'POST' request to URL : " + endpointUri.toString());
        log.debug("Post parameters : " + urlParameters);
        log.debug("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        log.debug(response.toString());
        return response.toString();

    }
}
