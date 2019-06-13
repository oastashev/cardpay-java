
# PaymentData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions | 
**authCode** | **String** | Authorization code, provided by bank *(for BANKCARD payment method only)* |  [optional]
**authenticationRequest** | **Boolean** | If set to &#x60;true&#x60;, amount must not be presented in request, no payment will be made, only cardholder authentication will be performed. Also can be used to generate token. *(for BANKCARD payment method only)* |  [optional]
**created** | **String** | Time when this payment started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format (yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;) |  [optional]
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code | 
**declineCode** | **String** | **Decline code** (only in decline case) |  [optional]
**declineReason** | **String** | Bank&#39;s message about transaction decline reason (only in decline case) |  [optional]
**dynamicDescriptor** | **String** | Short description of the service or product, must be enabled by CardPay manager to be used *(for BANKCARD payment method only)* |  [optional]
**generateToken** | **Boolean** | If set to &#x60;true&#x60;, token will be generated and returned in the response *(for BANKCARD payment method only)* |  [optional]
**id** | **String** | CardPay&#39;s payment id | 
**is3d** | **Boolean** | Was 3-D Secure authentication made or not *(for BANKCARD payment method only)* |  [optional]
**note** | **String** | Note about the transaction that will not be displayed to customer |  [optional]
**preauth** | **Boolean** | If set to &#x60;true&#x60;, the amount will not be captured but only blocked *(for BANKCARD payment method only)*. |  [optional]
**rrn** | **String** | RRN (Retrieval Reference Number), supplied by the acquiring financial institution *(for BANKCARD payment method only)* |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current payment status, *(mandatory for WEBMONEY and BITCOIN payment method only)* |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DECLINED | &quot;DECLINED&quot;
AUTHORIZED | &quot;AUTHORIZED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
REFUNDED | &quot;REFUNDED&quot;
PARTIALLY_REFUNDED | &quot;PARTIALLY_REFUNDED&quot;
VOIDED | &quot;VOIDED&quot;
CHARGED_BACK | &quot;CHARGED_BACK&quot;
CHARGEBACK_RESOLVED | &quot;CHARGEBACK_RESOLVED&quot;



