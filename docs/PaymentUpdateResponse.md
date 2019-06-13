
# PaymentUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | &#x60;CHANGE_STATUS&#x60; value |  [optional]
**paymentMethod** | **String** | Used payment method type name from payment methods list |  [optional]
**merchantData** | [**MerchantOrder**](MerchantOrder.md) |  |  [optional]
**paymentData** | [**ResponseUpdatedTransactionData**](ResponseUpdatedTransactionData.md) |  |  [optional]
**cardAccount** | [**CardAccount**](CardAccount.md) |  |  [optional]
**cryptocurrencyAccount** | [**CryptocurrencyAccount**](CryptocurrencyAccount.md) | Cryptocurrency account data *(for BITCOIN payment method only)* |  [optional]
**ewalletAccount** | [**EWalletAccount**](EWalletAccount.md) | eWallet account data *(for ALIPAY, QIWI, WEBMONEY and NETELLER payment methods only)* |  [optional]
**customer** | [**Customer**](Customer.md) | Customer data |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CHANGE_STATUS | &quot;CHANGE_STATUS&quot;
CONFIRM_3DS | &quot;CONFIRM_3DS&quot;



