
# PaymentPatchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**operation** | [**OperationEnum**](#OperationEnum) | if &#x60;operation&#x60; is CONFIRM_3DS then field &#x60;PaRes&#x60; is required if &#x60;operation&#x60; is CHANGE_STATUS then field &#x60;payment_data&#x60; is required | 
**paRes** | **String** | Bank authentication result for BANKCARD payments |  [optional]
**paymentData** | [**PaymentUpdateTransactionData**](PaymentUpdateTransactionData.md) | Payment data |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;



