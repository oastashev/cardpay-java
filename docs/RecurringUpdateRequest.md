
# RecurringUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**operation** | [**OperationEnum**](#OperationEnum) | &#x60;CHANGE_STATUS&#x60; value | 
**paRes** | **String** | Bank authentication result for BANKCARD payments. Required if &#x60;operation&#x60; is CONFIRM_3DS. |  [optional]
**recurringData** | [**PaymentUpdateTransactionData**](PaymentUpdateTransactionData.md) | Recurring data |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;



