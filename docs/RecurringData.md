
# RecurringData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions |  [optional]
**begin** | **Boolean** |  |  [optional]
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code | 
**dynamicDescriptor** | **String** | Short description of the service or product, must be enabled by CardPay manager to be used |  [optional]
**filing** | [**Filing**](Filing.md) | Filing data, should be send in all recurring requests besides first recurring request First recurring request should be send without filing attribute |  [optional]
**generateToken** | **Boolean** | If set to &#x60;true&#x60;, token will be generated and returned in the response |  [optional]
**initiator** | **String** | Can be only 2 values: &#x60;mit&#x60; (merchant initiated transaction), &#x60;cit&#x60; (cardholder initiated transaction) |  [optional]
**interval** | **Integer** | The frequency interval of period, can be 1-365 depending on selected period value. Maximum total value of period + interval can be 365 days / 52 weeks / 12 months / 1 year |  [optional]
**note** | **String** | Note about the transaction that will not be displayed to customer |  [optional]
**payments** | **Integer** | Number of total payments to be charged per defined interval |  [optional]
**period** | [**PeriodEnum**](#PeriodEnum) | Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60; |  [optional]
**plan** | [**Plan**](Plan.md) | Plan data |  [optional]
**preauth** | **Boolean** | If set to &#x60;true&#x60;, the amount will not be captured but only blocked *(for BANKCARD payment method only)*. |  [optional]
**retries** | **Integer** | Number of daily basis retry attempts in case of payment has not been captured |  [optional]
**subscriptionStart** | [**OffsetDateTime**](OffsetDateTime.md) | The time in &#39;yyyy-MM-dd&#39; format when subscription will actually become activated (grace period).Leave it empty to activate subscription at once without any grace period applied. |  [optional]


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



