
# RecurringConfirm3dsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**operation** | [**OperationEnum**](#OperationEnum) | &#x60;CONFIRM_3DS&#x60; value | 
**paRes** | **String** | Bank authentication result *(for BANKCARD payment method only)* | 
**recurringData** | [**PaymentUpdateTransactionData**](PaymentUpdateTransactionData.md) | Recurring data. Required if &#x60;operation&#x60; is CHANGE_STATUS. |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;



