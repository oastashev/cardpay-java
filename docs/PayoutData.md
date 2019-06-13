
# PayoutData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Represents the amount to be transferred to the customer&#39;s card, must be less than 100 millions | 
**created** | **String** | Time when this payout started in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format | 
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the payout transaction. Must match terminal currency | 
**declineCode** | **String** | **Decline code** (only in decline case) |  [optional]
**declineReason** | **String** | Bank&#39;s message about payout decline reason (only in decline case) |  [optional]
**dynamicDescriptor** | **String** | Short description of the service or product, must be enabled by CardPay manager to be used *(for BANKCARD, QIWI, WEBMONEY and BITCOIN payment methods only)* |  [optional]
**id** | **String** | CardPay&#39;s payout id | 
**note** | **String** | Note about the payout, not shown to the customer |  [optional]
**rrn** | **String** | RRN (Retrieval Reference Number), supplied by the acquiring financial institution |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current payout **status** | 


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



