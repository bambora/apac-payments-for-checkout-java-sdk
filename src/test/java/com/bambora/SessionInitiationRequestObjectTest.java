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

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;

public class SessionInitiationRequestObjectTest {

    private static final BigDecimal AMOUNT = new BigDecimal(1500);
    private SessionInitiationRequestObject sessionInitiationRequestObject;

    @Test
    public void objectConstructedWithMandatoryArguments() throws Exception {
        try {
            sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, "sessionID", "sessionKey",
                "http://server.url", "http://user.url", "custRef");
        } catch (Exception ex) {
            assertThat(ex.getMessage(), false);
        }
    }

    @Test(expected = Exception.class)
    public void amountIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(null, "sessionID", "sessionKey",
                "http://server.url", "http://user.url", "custRef");

    }

    @Test(expected = Exception.class)
    public void CustRefIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, "sessionID", "sessionKey",
                "http://server.url", "http://user.url", null);
    }

    @Test(expected = Exception.class)
    public void UserUrlIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, "sessionID", "sessionKey",
                "http://server.url", null, "custRef");
    }

    @Test(expected = Exception.class)
    public void ServerUrlIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, "sessionID", "sessionKey",
                null, "http://user.url", "custRef");
    }

    @Test(expected = Exception.class)
    public void sessionKeyIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, "sessionID", null,
                "http://server.url", "http://user.url", "custRef");
    }

    @Test(expected = Exception.class)
    public void sessionIdIsMandatory() throws Exception {
        sessionInitiationRequestObject = new SessionInitiationRequestObject(AMOUNT, null, "sessionKey",
                "http://server.url", "http://user.url", "custRef");
    }
}
