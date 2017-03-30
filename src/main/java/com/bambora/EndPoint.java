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

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Enum class containing service endpoints for demo and production environments
 */
public enum EndPoint {

    /**
     * The production endpoint URL for checkout. https://www.bambora.co.nz/access/index.aspx
     */
    PROD_URL("https://www.bambora.co.nz/access/index.aspx"),

    /**
     * The demo/test endpoint URL for checkout. https://demo.bambora.co.nz/access/index.aspx
     */
    DEMO_URL("https://demo.bambora.co.nz/access/index.aspx"),

    /**
     * DO NOT USE
     * For testing only
     */
    MALFORMED_URL("https://malformed.bambora.co.nz/access/index.aspx");

    private final URI uri;

    /**
     * EndPoint constructor
     * @param uriString is the url string
     */
    EndPoint(String uriString) {
        try {
            this.uri = new URI(uriString);
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    /**
     * getUri
     * @return the URI object of the endpoint
     */
    public URI getUri() {
        return uri;
    }
}
