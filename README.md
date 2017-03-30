# apac-payments-for-checkout-java-sdk

Java wrapper for Bambora Payments for Checkout API

## Getting started

- If you are not familiar with Bambora, start with the [documentation](https://dev-apac.bambora.com).
- Install the latest release.
- Check the API [reference](https://dev-apac.bambora.com/checkout.html).
- Check the full JavaDoc [documentation](./docs/index.html).


## Installation

- Releases are available in [maven central](http://search.maven.org/#artifactdetails|com.bambora|apac-payments-for-checkout-java-sdk|1.0.0|jar) and in this [repository](https://github.com/bambora/apac-payments-for-checkout-java-sdk/tag/v1.0.0).

```xml
<dependency>
  <groupId>com.bambora</groupId>
  <artifactId>apac-payments-for-checkout-java-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

## What's new

This is the initial release of the Java wrapper for the Bambora payment checkout API. 

## Usage

## Step 1: Create a client

Initialize the library by providing your api key:
```java
  Client client = new Client(
        "<ACCOUNT USERNAME>",
        "<ACCOUNT PASSWORD>",
        "<ACCOUNT LAYOUT>",
        EndPoint.DEMO_URL
  );
```

Make sure to use your account username, the secret password, and the appropriate endpoint. See Javadoc on [Client](./docs/com/bambora/Client.html) and [EndPoint](./docs/com/bambora/EndPoint.html)

## Step 2: Get a session token

```java
String sessionToken = client.getSessionToken(
        new SessionInitiationRequestObject(
                new BigDecimal(123.00),
                "session_id",
                "secret_session_key",
                "https://server_url",
                "https://user_url",
                "1234567"
        )
);
```
Get session token to start the payment process. The SessionInitiationRequestObject object based on the transaction details of the order, i.e. transaction amount. A one-use session token for the processing of this payment will be returned. See Javadoc on [SessionInitiationRequestObject](./docs/com/bambora/SessionInitiationRequestObject.html).

The "secret_session_key" is a value you provide. This value should only be passed to our endpoint and should not be sent to your front end. It is useful for security and verification purposes when handling our reply to your payment request. If you do not receive a session key or received an unmatched session key, then the respond must be treated as a fraudulent transaction.

At this stage, you will also need to store the session token against your order for use later. You would perhaps do this when a user proceed to the checkout page where the order details are shown to confirm the cart items and the total amount to be charged is correct.

## Step 3: Show our secured payment detail page

Get the URL to our secured payment details page.
```java
String paymentFormUrl = client.getPaymentFormUrl(
        order.getSessionId(),
        order.getSessionToken()
);
```

Display the bambora payment form using iframe.
```html
<html>
<body>
    <h2>Order Payment Page</h2>
    <iframe src="${paymentFormUrl}" style="height: 450px; width: 400px" />
</body>
</html>
```

To make it very easy to use and integrate our payment service in your application, we enable you to embed our secured payment details page within your web application using the iframe mark up tag.

This step usually comes after the order confirmation page; after the user clicked on the pay-now button.

During the generation of your payment details page, make a call to our payment service endpoint passing along the session id and token from previous step to get the one-use URL of the payment details page to use in your HTML template.

The session id and token are values you associated to your order object in the previous step.

See Javadoc on [Client](./docs/com/bambora/Client.html)

## Step 4: Handle the payment response

```java
/**
  * Your server_url endpoint to handle the POST response
  * from us to update your order status.
  */
public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
    NotificationOfCompletionMessage completionMessage = NotificationTranslator.translate(req);
    if(completionMessage.getResult() == Result.APPROVED) {
        // update order status
    } else {
        // take appropriate actions
    }
    ...
}
```

There are 2 parts to the handling of payment submission response.

1. You will need to make available the server_url endpoint that accept a POST request from us to update your application of the result of your payment request. This endpoint was provided by you to us in a previous step as "server_url". A simple way to think of this is a background process where our system talks to your application independent of the user.

2. You will also need to make available the user_url endpoint that accept a POST request from us to generate the payment result page for your user. This endpoint was provided by you to us in a previous step as "user_url" and it can contain an identifier to the customer order so you can check its status to render an appropriate page.

See Javadoc on [NotificationOfCompletionMessage](./docs/com/bambora/notification/NotificationOfCompletionMessage.html) and [Result](./docs/com/bambora/notification/NotificationOfCompletionMessage.Result.html).

## Changelog

### 1.0.0
Initial commit

## License

Copyright 2017 Bambora.

MIT License (enclosed)