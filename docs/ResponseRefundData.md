
# ResponseRefundData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Refund transaction amount | 
**authCode** | **String** | Authorization code, provided by bank *(for BANK_CARD payment methods only)* |  [optional]
**created** | **String** | Refund creation date and time ([ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format) | 
**currency** | **String** | Currency of refunded amount, [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code | 
**declineCode** | **String** | Refund **decline code** (only for DECLINED refund status) |  [optional]
**declineReason** | **String** | Refund decline reason (only for DECLINED refund status) |  [optional]
**id** | **String** | ID of the newly created refund in CardPay system | 
**is3d** | **Boolean** | Was 3-D Secure authentication made or not *(for BANK_CARD payment methods only)* |  [optional]
**rrn** | **String** | RRN (Retrieval Reference Number), supplied by the acquiring financial institution *(for BANK_CARD payment methods only)* |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Refund **status** in CardPay system | 


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



