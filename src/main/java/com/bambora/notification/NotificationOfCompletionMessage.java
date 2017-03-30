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
 * NotificationOfCompletionMessage DTO
 */
public class NotificationOfCompletionMessage {

    private Result result;
    private String receipt;
    private DeclinedCode declinedCode;
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
     * NotificationOfCompletionMessage constructor
     * @param result result
     * @param receipt receipt
     * @param declinedCode declinedCode
     * @param declinedMessage declinedMessage
     * @param secureSessionToken secureSessionToken
     * @param sessionKey sessionKey
     * @param sessionId sessionId
     * @param maskedCard maskedCard
     * @param expiryDate expiryDate
     * @param cardHolderName cardHolderName
     * @param cardType cardType
     * @param cardSubType cardSubType
     * @param txDateTime txDateTime
     * @param custNumber custNumber
     * @param custRef custRef
     * @param amount amount
     * @param surcharge surcharge
     * @param amountIncludingSurcharge amountIncludingSurcharge
     * @param settlementDate settlementDate
     * @param reference1 reference1
     * @param reference2 reference2
     * @param reference3 reference3
     * @param reference4 reference4
     * @param reference5 reference5
     * @param accTitle accTitle
     * @param accRouting accRouting
     * @param accNo accNo
     * @param token token
     * @param tokenResult tokenResult
     * @param tokenDeclinedCode tokenDeclinedCode
     * @param tokenDeclinedMessage tokenDeclinedMessage
     */
    public NotificationOfCompletionMessage(Result result, String receipt, DeclinedCode declinedCode, String declinedMessage, String secureSessionToken, String sessionKey, String sessionId, String maskedCard, String expiryDate, String cardHolderName, String cardType, String cardSubType, String txDateTime, String custNumber, String custRef, String amount, String surcharge, String amountIncludingSurcharge, String settlementDate, String reference1, String reference2, String reference3, String reference4, String reference5, String accTitle, String accRouting, String accNo, String token, String tokenResult, String tokenDeclinedCode, String tokenDeclinedMessage) {
        this.result = result;
        this.receipt = receipt;
        this.declinedCode = declinedCode;
        this.declinedMessage = declinedMessage;
        this.secureSessionToken = secureSessionToken;
        this.sessionKey = sessionKey;
        this.sessionId = sessionId;
        this.maskedCard = maskedCard;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.cardSubType = cardSubType;
        this.txDateTime = txDateTime;
        this.custNumber = custNumber;
        this.custRef = custRef;
        this.amount = amount;
        this.surcharge = surcharge;
        this.amountIncludingSurcharge = amountIncludingSurcharge;
        this.settlementDate = settlementDate;
        this.reference1 = reference1;
        this.reference2 = reference2;
        this.reference3 = reference3;
        this.reference4 = reference4;
        this.reference5 = reference5;
        this.accTitle = accTitle;
        this.accRouting = accRouting;
        this.accNo = accNo;
        this.token = token;
        this.tokenResult = tokenResult;
        this.tokenDeclinedCode = tokenDeclinedCode;
        this.tokenDeclinedMessage = tokenDeclinedMessage;
    }

    /**
     * getResult
     * @return result
     */
    public Result getResult() {
        return result;
    }

    /**
     * getReceipt
     * @return receipt
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * getDeclinedCode
     * @return DeclinedCode
     */
    public DeclinedCode getDeclinedCode() {
        return declinedCode;
    }

    /**
     * getDeclinedMessage
     * @return declinedMessage
     */
    public String getDeclinedMessage() {
        return declinedMessage;
    }

    /**
     * getSecureSessionToken
     * @return secureSessionToken
     */
    public String getSecureSessionToken() {
        return secureSessionToken;
    }

    /**
     * getSessionKey
     * @return sessionKey
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * getSessionId
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * getMaskedCard
     * @return maskedCard
     */
    public String getMaskedCard() {
        return maskedCard;
    }

    /**
     * getExpiryDate
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * getCardHolderName
     * @return cardHolderName
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * getCardType
     * @return cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * getCardSubType
     * @return cardSubType
     */
    public String getCardSubType() {
        return cardSubType;
    }

    /**
     * getTxDateTime
     * @return txDateTime
     */
    public String getTxDateTime() {
        return txDateTime;
    }

    /**
     * getCustNumber
     * @return custNumber
     */
    public String getCustNumber() {
        return custNumber;
    }

    /**
     * getCustRef
     * @return custRef
     */
    public String getCustRef() {
        return custRef;
    }

    /**
     * getAmount
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * getSurcharge
     * @return surcharge
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * getAmountIncludingSurcharge
     * @return amountIncludingSurcharge
     */
    public String getAmountIncludingSurcharge() {
        return amountIncludingSurcharge;
    }

    /**
     * getSettlementDate
     * @return settlementDate
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * getReference1
     * @return reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * getReference2
     * @return reference2
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * getReference3
     * @return reference3
     */
    public String getReference3() {
        return reference3;
    }

    /**
     * getReference4
     * @return reference4
     */
    public String getReference4() {
        return reference4;
    }

    /**
     * getReference5
     * @return reference5
     */
    public String getReference5() {
        return reference5;
    }

    /**
     * getAccTitle
     * @return accTitle
     */
    public String getAccTitle() {
        return accTitle;
    }

    /**
     * getAccRouting
     * @return accRouting
     */
    public String getAccRouting() {
        return accRouting;
    }

    /**
     * getAccNo
     * @return accNo
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * getToken
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * getTokenResult
     * @return tokenResult
     */
    public String getTokenResult() {
        return tokenResult;
    }

    /**
     * getTokenDeclinedCode
     * @return tokenDeclinedCode
     */
    public String getTokenDeclinedCode() {
        return tokenDeclinedCode;
    }

    /**
     * getTokenDeclinedMessage
     * @return tokenDeclinedMessage
     */
    public String getTokenDeclinedMessage() {
        return tokenDeclinedMessage;
    }

    /**
     * Result Enum
     */
    public enum Result {
        DECLINED(0), APPROVED(1), IN_PROGRESS(2), SESSION_EXPIRED(3);

        private final int status;

        Result(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }

        public static Result fromStatus(int status) {
            for (Result result : Result.values()) {
                if (status == result.getStatus()) {
                    return result;
                }
            }
            return null;
        }
    }

    /**
     * DeclinedCode enum
     */
    public enum DeclinedCode {
        SYSTEM_EXCEPTION(100, "System exception"),
        INVALID_COMPANY_ID(101, "Invalid company identifier"),
        INVALID_ACCOUNT_ID(102, "Invalid account identifier"),
        INVALID_API_USERNAME_PASSWORD(103, "Invalid API username or password"),
        INVALID_TRANSACTION_TYPE_ID(104, "Invalid transaction type identifier"),
        INVALID_CHANNEL_ID(105, "Invalid channel identifier"),
        INVALID_CURRENCY_ID(106, "Invalid currency identifier"),
        INVALID_TRANSACTION_AMOUNT(107, "Invalid transaction amount"),
        NO_CUSTOMER_REFERENCE(109, "No customer reference supplied"),
        INVALID_CREDIT_CARD_NUMBER(110, "Invalid credit card number"),
        INVALID_CREDIT_CARD_EXPIRY_DATE(111, "Invalid credit card expiry date"),
        CUSTOMER_STATUS_NOT_ACTIVE(119, "Customer status not active"),
        ACCOUNT_STATUS_NOT_ACTIVE(120, "Account status not active"),
        ACCOUNT_MISSING_RISK_PROFILE_RULE(121, "Account does not have any risk profile rule assigned"),
        REGISTERED_CUSTOMER_DETAILS_NOT_FOUND(122, "Registered customer details not found"),
        CVN_REQUIRED_BUT_NOT_SUPPLIED(124, "CVN required but not supplied"),
        ACCOUNT_NOT_SUPPORT_CURRENCY(150, "Account not setup to accept supplied currency transactions"),
        ACCOUNT_NOT_SUPPORT_CURRENCY_CORRECTLY(151, "Account not setup correctly to accept supplied currency transactions"),
        ACCOUNT_NOT_SUPPORT_CREDIT_CARD_TYPE(152, "Account not setup to accept credit card transactions for the supplied credit card type"),
        ACCOUNT_NOT_SUPPORT_CREDIT_CARD_AMOUNT(153, "Account not setup to accept credit card transactions for the supplied amount"),
        INVALID_MERCHANT_ACCOUNT_DETAILS(154, "Merchant account details not setup correctly"),
        INVALID_INTERFACE_DETAILS(155, "Interface details not setup correctly"),
        RISK_PROFILE_RULES_FAILED(162, "Risk profile rules failed"),
        FAILED_RETRIEVING_RECEIPT_NUMBER(180, "Exception encountered when retrieving the receipt number"),
        FAILED_RECEIVING_CLIENT_TRANSACTION_DATA(181, "Exception encountered when receiving transaction data from client"),
        FAILED_CREATING_TRANSACTION_XML_LOG(182, "Exception encountered when creating transaction XML log"),
        FAILED_PARSING_TRANSACTION_XML(183, "Exception parsing transaction XML"),
        FAILED_VALIDATING_TRANSACTION_XML(184, "Exception validating transaction XML"),
        FAILED_FINDING_TRANSACTION_ID(190, "Exception encountered when finding transaction identifier"),
        FAILED_FINDING_CREDIT_CARD_INTERFACE(191, "Exception encountered when submitting transaction to interface"),
        FAILED_SUBMITTING_TRANSACTION(192, "Exception encountered when submitting transaction to interface"),
        INTERFACE_ERROR(200, "Interface error"),
        INTERFACE_ERROR_WITH_AUTO_REVERSAL(201, "Interface error with successful automatic reversal"),
        BATCH_RECORD_EXCEPTION(200, "Batch record exception"),
        REMOTE_INTERFACE_EXCEPTION(997, "Remote interface exception"),
        TRANSACTION_PAYMENT_CANCELLED(998, "Transaction payment cancelled"),
        TIMEOUT(999, "Timeout when waiting for a response");

        private final int status;
        private final String description;

        /**
         * DeclinedCode constructor
         * @param status status
         * @param description description
         */
        DeclinedCode(int status, String description) {
            this.status = status;
            this.description = description;
        }

        /**
         * getStatus
         * @return status code integer
         */
        public int getStatus() {
            return status;
        }

        /**
         * getDescription
         * @return description
         */
        public String getDescription() {
            return description;
        }

        /**
         * fromStatus method. Translate decline code number to {@link DeclinedCode}
         * @param status integer
         * @return {@link DeclinedCode}
         */
        public static DeclinedCode fromStatus(int status) {
            for (DeclinedCode declinedCode : DeclinedCode.values()) {
                if (status == declinedCode.getStatus()) {
                    return declinedCode;
                }
            }
            return null;
        }
    }
}
