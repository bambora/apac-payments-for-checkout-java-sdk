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

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;

import static com.bambora.EndPoint.DEMO_URL;
import static com.bambora.EndPoint.MALFORMED_URL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ClientTest {

    public static final String USERNAME = "username";
    public static final String PASSWORD = "p@ssword";
    public static final String DL = "checkout_v1_purchase";
    public static final String INVALID_DL = "Invalid_DL";
    public static final String INVALID_PASSWORD = "Invalid_password";
    public static final String INVALID_USERNAME = "invalid_username";
    public static final String MERCHANT_URL = "http://merchant.url";
    private SecureRandom random = new SecureRandom();

    private Client client;

    @Test
    public void clientConstructedWithoutThrowingException() throws Exception {
        try {
            client = new Client(USERNAME, PASSWORD, DL, DEMO_URL);
        } catch (Exception ex) {
            assertThat(ex.getMessage(), false);
        }
    }

    @Test(expected = ClientException.class)
    public void throwsInvalidUsernameException() throws Exception {
        client = new Client(null, PASSWORD, DL, DEMO_URL);
    }

    @Test(expected = ClientException.class)
    public void throwsInvalidPasswordException() throws Exception {
        client = new Client(USERNAME, null, DL, DEMO_URL);
    }

    @Test(expected = ClientException.class)
    public void throwsInvalidDLException() throws Exception {
        client = new Client(USERNAME, PASSWORD, null, DEMO_URL);
    }

    @Test
    @Ignore
    public void getSessionTokenReturnsUUID() throws Exception {
        client = new Client(USERNAME, PASSWORD, DL, DEMO_URL);
        String sessionToken = client.getSessionToken(new SessionInitiationRequestObject(randomBigDecimal(), randomString(),
                randomString(), MERCHANT_URL, MERCHANT_URL, randomString()));
        assertThat(sessionToken, Matchers.matchesPattern("[a-z0-9]{8}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{4}-[a-z0-9]{12}"));
    }

    @Test
    public void getSessionTokenReturnsExceptionForInvalidDL() throws Exception {
        try {
            client = new Client(USERNAME, PASSWORD, INVALID_DL, DEMO_URL);
            String sessionToken = client.getSessionToken(new SessionInitiationRequestObject(randomBigDecimal(), randomString(),
                    randomString(), MERCHANT_URL, MERCHANT_URL, randomString()));
        } catch (ClientException e) {
            assertThat(e.getMessage(), containsString("Invalid username or password"));
        }
    }

    @Test
    public void getSessionTokenReturnsExceptionForInvalidUsernamePassword() throws Exception {
        try {
            client = new Client(INVALID_USERNAME, INVALID_PASSWORD, DL, DEMO_URL);
            String sessionToken = client.getSessionToken(new SessionInitiationRequestObject(randomBigDecimal(), randomString(),
                    randomString(), MERCHANT_URL, MERCHANT_URL, randomString()));
        } catch (ClientException e) {
            assertThat(e.getMessage(), is("Invalid username or password"));
        }
    }

    @Test
    public void getSessionTokenReturnsExceptionForMalformedUrl() throws Exception {
        try {
            client = new Client(USERNAME, PASSWORD, DL, MALFORMED_URL);
            String sessionToken = client.getSessionToken(new SessionInitiationRequestObject(randomBigDecimal(), randomString(),
                    randomString(), MERCHANT_URL, MERCHANT_URL, randomString()));
        } catch (ClientException e) {
            assertThat(e.getMessage(), is("java.net.UnknownHostException: malformed.bambora.co.nz"));
        }
    }

    @Test
    public void getPaymentFormUrlReturnsAsExpected() {
        final String SESSION_ID = randomString();
        final String SECURE_SESSION_TOKEN = randomString();

        client = new Client(USERNAME, PASSWORD, DL, DEMO_URL);
        String result = client.getPaymentFormUrl(SESSION_ID, SECURE_SESSION_TOKEN);
        Assert.assertEquals(result, DEMO_URL.getUri() + "?SessionId=" + SESSION_ID + "&SST=" + SECURE_SESSION_TOKEN);
    }

    @Test
    public void testConvertingBigDecimalToStringWithoutDot() {
        Assert.assertEquals("12", Client.toStringWithoutDot(new BigDecimal(0.12345)));
        Assert.assertEquals("123", Client.toStringWithoutDot(new BigDecimal(1.2345)));
        Assert.assertEquals("1234500", Client.toStringWithoutDot(new BigDecimal(12345)));
        Assert.assertEquals("12", Client.toStringWithoutDot(new BigDecimal(0.124)));
        Assert.assertEquals("12", Client.toStringWithoutDot(new BigDecimal(0.12499)));
        Assert.assertEquals("13", Client.toStringWithoutDot(new BigDecimal(0.125)));
        Assert.assertEquals("13", Client.toStringWithoutDot(new BigDecimal(0.129)));
        Assert.assertEquals("1", Client.toStringWithoutDot(new BigDecimal(0.01)));
        Assert.assertEquals("123456789012312", Client.toStringWithoutDot(new BigDecimal(1234567890123.12)));

        Assert.assertNotEquals("123450", Client.toStringWithoutDot(new BigDecimal(123.45)));
        Assert.assertNotEquals("12", Client.toStringWithoutDot(new BigDecimal(0.125)));
        Assert.assertNotEquals("14", Client.toStringWithoutDot(new BigDecimal(0.125)));
    }

    private String randomString() {
        return new BigInteger(130, random).toString(32);
    }

    private BigDecimal randomBigDecimal() {
        return new BigDecimal(Math.random()).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}