/**
 * Provides the classes necessary for integration with Bambora payment gateway. I.e. accept credit card and
 * bank account payments on your web application in real-time with notification of the transaction results
 * sent back to your web application for display and update of internal systems.
 * <p>
 * The {@link com.bambora.Client} class is for initiating a session request for real-time payments.
 * <p>
 * The {@link com.bambora.notification.NotificationOfCompletionMessage} class is a DTO of the notification of complete
 * message you will receive from Bambora payment gateway once a payment has been processed. See {@link com.bambora.notification.NotificationTranslator}
 * to retrieve and translate this information from HttpServletRequest to {@link com.bambora.notification.NotificationOfCompletionMessage}.
 */
package com.bambora;
