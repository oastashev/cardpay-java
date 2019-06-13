
# UpdatedSubscriptionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeStatusClaimId** | **String** |  |  [optional]
**filing** | [**ResponseFiling**](ResponseFiling.md) |  |  [optional]
**paymentData** | [**PlanDataforUpdatedSubscriptionData**](PlanDataforUpdatedSubscriptionData.md) |  |  [optional]
**remainingAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**id** | **String** | Represents the ID of the modified subscription |  [optional]
**statusTo** | [**StatusToEnum**](#StatusToEnum) | Requested action (status to be set) |  [optional]
**isExecuted** | **Boolean** | Indicates was the request successful or not |  [optional]
**details** | **String** | The reason why request was unsuccessful |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Subscription update date |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of modified subscription (&#39;active&#39; or &#39;inactive&#39;) |  [optional]


<a name="StatusToEnum"></a>
## Enum: StatusToEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;
CANCELLED | &quot;CANCELLED&quot;
PAST_DUE | &quot;PAST_DUE&quot;
PENDING | &quot;PENDING&quot;
COMPLETED | &quot;COMPLETED&quot;
CARD_EXPIRED | &quot;CARD_EXPIRED&quot;


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



