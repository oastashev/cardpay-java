
# ChangeSubscriptionStatusClaimResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**details** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subscriptionData** | [**ClaimSubscriptionData**](ClaimSubscriptionData.md) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IN_PROCESS | &quot;IN_PROCESS&quot;
STOPPED | &quot;STOPPED&quot;
COMPLETED | &quot;COMPLETED&quot;



