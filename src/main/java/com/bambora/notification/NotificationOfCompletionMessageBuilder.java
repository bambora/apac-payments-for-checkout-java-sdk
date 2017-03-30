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

/**
 * A builder class for NotificationOfCompletionMessage.
 */
class NotificationOfCompletionMessageBuilder {
    private NotificationOfCompletionMessage.Result result;
    private String receipt;
    private NotificationOfCompletionMessage.DeclinedCode declinedCode;
    private String declinedMessage;
    private String secureSessionToken;
    private String sessionKey;
    private String sessionId;
    private String maskedCard;
    private String expiryDate;
    private String cardHolderName;
    private String cardType;
    private String cardSubType;
    private String txDateTime;
    private String custNumber;
    private String custRef;
    private String amount;
    private String surcharge;
    private String amountIncludingSurcharge;
    private String settlementDate;
    private String reference1;
    private String reference2;
    private String reference3;
    private String reference4;
    private String reference5;
    private String accTitle;
    private String accRouting;
    private String accNo;
    private String token;
    private String tokenResult;
    private String tokenDeclinedCode;
    private String tokenDeclinedMessage;

    /**
     * setResult
     * @param result result
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setResult(NotificationOfCompletionMessage.Result result) {
        this.result = result;
        return this;
    }

    /**
     * setReceipt
     * @param receipt receipt
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReceipt(String receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * setDeclinedCode
     * @param declinedCode declinedCode
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setDeclinedCode(NotificationOfCompletionMessage.DeclinedCode declinedCode) {
        this.declinedCode = declinedCode;
        return this;
    }

    /**
     * setDeclinedMessage
     * @param declinedMessage declinedMessage
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setDeclinedMessage(String declinedMessage) {
        this.declinedMessage = declinedMessage;
        return this;
    }

    /**
     * setSecureSessionToken
     * @param secureSessionToken secureSessionToken
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setSecureSessionToken(String secureSessionToken) {
        this.secureSessionToken = secureSessionToken;
        return this;
    }

    /**
     * setSessionKey
     * @param sessionKey sessionKey
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }

    /**
     * setSessionId
     * @param sessionId sessionId
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * setMaskedCard
     * @param maskedCard maskedCard
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setMaskedCard(String maskedCard) {
        this.maskedCard = maskedCard;
        return this;
    }

    /**
     * setExpiryDate
     * @param expiryDate expiryDate
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * setCardHolderName
     * @param cardHolderName cardHolderName
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        return this;
    }

    /**
     * setCardType
     * @param cardType cardType
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    /**
     * setCardSubType
     * @param cardSubType cardSubType
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setCardSubType(String cardSubType) {
        this.cardSubType = cardSubType;
        return this;
    }

    /**
     * setTxDateTime
     * @param txDateTime txDateTime
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setTxDateTime(String txDateTime) {
        this.txDateTime = txDateTime;
        return this;
    }

    /**
     * setCustNumber
     * @param custNumber custNumber
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setCustNumber(String custNumber) {
        this.custNumber = custNumber;
        return this;
    }

    /**
     * setCustRef
     * @param custRef custRef
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setCustRef(String custRef) {
        this.custRef = custRef;
        return this;
    }

    /**
     * setAmount
     * @param amount amount
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * setSurcharge
     * @param surcharge surcharge
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setSurcharge(String surcharge) {
        this.surcharge = surcharge;
        return this;
    }

    /**
     * setAmountIncludingSurcharge
     * @param amountIncludingSurcharge amountIncludingSurcharge
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setAmountIncludingSurcharge(String amountIncludingSurcharge) {
        this.amountIncludingSurcharge = amountIncludingSurcharge;
        return this;
    }

    /**
     * setSettlementDate
     * @param settlementDate settlementDate
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    /**
     * setReference1
     * @param reference1 reference1
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReference1(String reference1) {
        this.reference1 = reference1;
        return this;
    }

    /**
     * setReference2
     * @param reference2 reference2
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReference2(String reference2) {
        this.reference2 = reference2;
        return this;
    }

    /**
     * setReference3
     * @param reference3 reference3
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReference3(String reference3) {
        this.reference3 = reference3;
        return this;
    }

    /**
     * setReference4
     * @param reference4 reference4
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReference4(String reference4) {
        this.reference4 = reference4;
        return this;
    }

    /**
     * setReference5
     * @param reference5 reference5
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setReference5(String reference5) {
        this.reference5 = reference5;
        return this;
    }

    /**
     * setAccTitle
     * @param accTitle accTitle
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setAccTitle(String accTitle) {
        this.accTitle = accTitle;
        return this;
    }

    /**
     * setAccRouting
     * @param accRouting accRouting
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setAccRouting(String accRouting) {
        this.accRouting = accRouting;
        return this;
    }

    /**
     * setAccNo
     * @param accNo accNo
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setAccNo(String accNo) {
        this.accNo = accNo;
        return this;
    }

    /**
     * setToken
     * @param token token
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * setTokenResult
     * @param tokenResult tokenResult
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setTokenResult(String tokenResult) {
        this.tokenResult = tokenResult;
        return this;
    }

    /**
     * setTokenDeclinedCode
     * @param tokenDeclinedCode tokenDeclinedCode
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setTokenDeclinedCode(String tokenDeclinedCode) {
        this.tokenDeclinedCode = tokenDeclinedCode;
        return this;
    }

    /**
     * setTokenDeclinedMessage
     * @param tokenDeclinedMessage tokenDeclinedMessage
     * @return NotificationOfCompletionMessageBuilder
     */
    NotificationOfCompletionMessageBuilder setTokenDeclinedMessage(String tokenDeclinedMessage) {
        this.tokenDeclinedMessage = tokenDeclinedMessage;
        return this;
    }

    /**
     * createNotificationOfCompletionResponse
     * @return NotificationOfCompletionMessage object
     */
    NotificationOfCompletionMessage createNotificationOfCompletionResponse() {
        return new NotificationOfCompletionMessage(result, receipt, declinedCode, declinedMessage, secureSessionToken, sessionKey, sessionId, maskedCard, expiryDate, cardHolderName, cardType, cardSubType, txDateTime, custNumber, custRef, amount, surcharge, amountIncludingSurcharge, settlementDate, reference1, reference2, reference3, reference4, reference5, accTitle, accRouting, accNo, token, tokenResult, tokenDeclinedCode, tokenDeclinedMessage);
    }
}