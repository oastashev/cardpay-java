
# RecurringPatchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**paRes** | **String** | Bank authentication result for BANKCARD payments. Required if &#x60;operation&#x60; is CONFIRM_3DS. |  [optional]
**recurringData** | [**PaymentUpdateTransactionData**](PaymentUpdateTransactionData.md) | Recurring data. Required if &#x60;operation&#x60; is CHANGE_STATUS. |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;



