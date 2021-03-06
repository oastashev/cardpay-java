
# ResponseRecurringData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Recurring amount | 
**authCode** | **String** | Authorization code, provided by bank |  [optional]
**created** | **String** | Date and time when this recurring payment created, up to milliseconds, [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format (yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;) | 
**currency** | **String** | Recurring currency code ([ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code | 
**declineCode** | **String** | **Decline code** (only in decline case) |  [optional]
**declineReason** | **String** | Bank&#39;s message about transaction decline reason (only in decline case) |  [optional]
**filing** | [**ResponseFiling**](ResponseFiling.md) | CardPay&#39;s filing data |  [optional]
**id** | **String** | CardPay&#39;s recurring id | 
**is3d** | **Boolean** | Was 3-D Secure authentication made or not |  [optional]
**note** | **String** | Payment note |  [optional]
**rrn** | **String** | RRN (Retrieval Reference Number), supplied by the acquiring financial institution |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current recurring payment **status** | 
**subscription** | [**Subscription**](Subscription.md) | Subscription data |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Recurring payment type name; can be ONECLICK, SCHEDULED, INSTALLMENT |  [optional]


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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ONECLICK | &quot;ONECLICK&quot;
SCHEDULED | &quot;SCHEDULED&quot;
INSTALLMENT | &quot;INSTALLMENT&quot;



