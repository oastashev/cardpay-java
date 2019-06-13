
# ResponsePlanData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of created plan | 
**name** | **String** | Name of created plan | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Time when this plan was created in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format (yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;) | 
**status** | [**StatusEnum**](#StatusEnum) | Status of created plan: &#x60;active&#x60; or &#x60;hold&#x60; | 
**period** | [**PeriodEnum**](#PeriodEnum) | Period of created plan. &#x60;minute&#x60; value is not allowed for production site. | 
**interval** | **Integer** | Interval of created plan | 
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of plan | 
**amount** | [**BigDecimal**](BigDecimal.md) | The total amount of created plan | 
**retries** | **Integer** | Count of retries for Retry Logic |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



