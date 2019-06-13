
# SubscriptionGetResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountDue** | [**BigDecimal**](BigDecimal.md) | Amount of payments left to be captured |  [optional]
**amountTotal** | [**BigDecimal**](BigDecimal.md) | Total amount of subscription to be paid before completion |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Creation time ISO 8601 format | 
**currency** | **String** | ISO 4217 currency code |  [optional]
**customer** | [**PayoutCustomer**](PayoutCustomer.md) | Account id that has subscription applied | 
**description** | **String** | Description of subscription | 
**id** | **String** | ID of subscription | 
**interval** | **Integer** | Interval of subscription |  [optional]
**nextPayment** | [**NextSubscriptionPaymentforSubscriptionGetResponse**](NextSubscriptionPaymentforSubscriptionGetResponse.md) | Next payment data |  [optional]
**paymentsDue** | **Integer** | Number of payments left to be captured |  [optional]
**period** | [**PeriodEnum**](#PeriodEnum) | Period of subscription |  [optional]
**plan** | [**Plan**](Plan.md) | Name of plan |  [optional]
**retries** | **Integer** | Count of retries in retry logic |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of subscription | 
**statusReason** | **String** | Reason of subscription cancellation that was made by Cardpay |  [optional]
**subscriptionStart** | [**OffsetDateTime**](OffsetDateTime.md) | The time in &#39;yyyy-MM-dd&#39; format when subscription actually becomes activated (grace period) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of subscription |  [optional]


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
CANCELLED | &quot;CANCELLED&quot;
PAST_DUE | &quot;PAST_DUE&quot;
PENDING | &quot;PENDING&quot;
COMPLETED | &quot;COMPLETED&quot;
CARD_EXPIRED | &quot;CARD_EXPIRED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ONECLICK | &quot;ONECLICK&quot;
SCHEDULED | &quot;SCHEDULED&quot;
INSTALLMENT | &quot;INSTALLMENT&quot;



