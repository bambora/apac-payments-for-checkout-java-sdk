/**
 * Provides the classes necessary to support notification of completion.
 * <p>
 * The {@link com.bambora.notification.NotificationTranslator} class providers the functionality to transfer the
 * notification of complete message from HttpServletRequest to {@link com.bambora.notification.NotificationOfCompletionMessage}.
 * <p>
 * The {@link com.bambora.notification.NotificationOfCompletionMessage} class is a DTO of the notification of complete
 * message you will receive from Bambora payment gateway once a payment has been processed. See {@link com.bambora.notification.NotificationTranslator}
 * to retrieve and translate this information from HttpServletRequest to {@link com.bambora.notification.NotificationOfCompletionMessage}.
 */
package com.bambora.notification;
