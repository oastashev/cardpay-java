
# PlanData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount charged per period defined in plan in selected currency with dot as a decimal separator, limit is defined by payment method and transaction details. | 
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of plan | 
**interval** | **Integer** | The frequency interval of period, can be 1-365 depending on selected period value. Maximum total value of period + interval can be 365 days / 52 weeks / 12 months / 1 year | 
**name** | **String** | Plan name | 
**period** | [**PeriodEnum**](#PeriodEnum) | Initial period of recurring, can be &#x60;day&#x60;, &#x60;week&#x60;, &#x60;month&#x60;, &#x60;year&#x60; | 
**retries** | **Integer** | Number of daily basis retry attempts in case of payment has not been captured |  [optional]


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



