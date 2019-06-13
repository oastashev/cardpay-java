
# RecurringUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | &#x60;CHANGE_STATUS&#x60; value |  [optional]
**paymentMethod** | **String** | Used payment method type name from payment methods list |  [optional]
**merchantData** | [**MerchantOrder**](MerchantOrder.md) |  |  [optional]
**recurringData** | [**ResponseUpdatedTransactionData**](ResponseUpdatedTransactionData.md) |  |  [optional]
**cardAccount** | [**CardAccount**](CardAccount.md) |  |  [optional]
**customer** | [**Customer**](Customer.md) | Customer data |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;



