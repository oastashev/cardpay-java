
# ChangedPlanData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Represents the ID of the modified plan |  [optional]
**details** | **String** | The reason why request was unsuccessful |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Plan update date |  [optional]
**isExecuted** | **Boolean** | Indicates was the request successful or not |  [optional]
**nameTo** | **String** | Requested action (name to be set). Will be returned for &#x60;RENAME&#x60; operation |  [optional]
**name** | **String** | Name of modified plan. Will be returned for &#x60;RENAME&#x60; operation |  [optional]
**statusTo** | [**StatusToEnum**](#StatusToEnum) | Requested action (status to be set). Will be returned for &#x60;CHANGE_STATUS&#x60; operation |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of modified plan (&#39;ACTIVE&#39; or &#39;HOLD&#39;). Will be returned for &#x60;CHANGE_STATUS&#x60; operation |  [optional]


<a name="StatusToEnum"></a>
## Enum: StatusToEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



