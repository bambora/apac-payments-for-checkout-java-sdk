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
package com.bambora.notification;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Integer.parseInt;

/**
 * A handy helper class to transform the Notification Of Completion Message from a HttpServletRequest request to a NotificationOfCompletionMessage POJO.
 */
public class NotificationTranslator {

    /**
     * Translate method for translating HttpServletRequest to NotificationOfCompletionResponse DTO
     * @param req is HttpServletRequest
     * @return NotificationOfCompletionResponse object
     */
    public static NotificationOfCompletionMessage translate(HttpServletRequest req) {
        NotificationOfCompletionMessageBuilder responseBuilder = new NotificationOfCompletionMessageBuilder();
        return responseBuilder
                .setResult(NotificationOfCompletionMessage.Result.fromStatus(parseInt(req.getParameter("Result"))))
                .setReceipt(req.getParameter("Receipt"))
                .setDeclinedCode(NotificationOfCompletionMessage.DeclinedCode.fromStatus(parseInt(req.getParameter("DeclinedCode"))))
                .setDeclinedMessage(req.getParameter("DeclinedMessage"))
                .setSecureSessionToken(req.getParameter("SST"))
                .setSessionKey(req.getParameter("SessionKey"))
                .setSessionId(req.getParameter("SessionId"))
                .setMaskedCard(req.getParameter("MaskedCard"))
                .setExpiryDate(req.getParameter("ExpiryDate"))
                .setCardHolderName(req.getParameter("CardHolderName"))
                .setCardType(req.getParameter("CardType"))
                .setCardSubType(req.getParameter("CardSubType"))
                .setTxDateTime(req.getParameter("TxDateTime"))
                .setCustNumber(req.getParameter("CustNumber"))
                .setCustRef(req.getParameter("CustRef"))
                .setAmount(req.getParameter("Amount"))
                .setSurcharge(req.getParameter("Surcharge"))
                .setAmountIncludingSurcharge(req.getParameter("AmountIncludingSurcharge"))
                .setSettlementDate(req.getParameter("SettlementDate"))
                .setReference1(req.getParameter("Reference1"))
                .setReference2(req.getParameter("Reference2"))
                .setReference3(req.getParameter("Reference3"))
                .setReference4(req.getParameter("Reference4"))
                .setReference5(req.getParameter("Reference5"))
                .setAccTitle(req.getParameter("Acctitle"))
                .setAccRouting(req.getParameter("AccRouting"))
                .setAccNo(req.getParameter("Accno"))
                .setToken(req.getParameter("Token"))
                .setTokenResult(req.getParameter("TokenResult"))
                .setTokenDeclinedCode(req.getParameter("TokenDeclinedCode"))
                .setTokenDeclinedMessage(req.getParameter("TokenDeclinedMessage"))
                .createNotificationOfCompletionResponse();
    }
}
