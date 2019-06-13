
# PayoutRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**cardAccount** | [**PayoutCardAccount**](PayoutCardAccount.md) | Bank card account data *(for BANKCARD payment method only)* |  [optional]
**cryptocurrencyAccount** | [**PayoutCryptocurrencyAccount**](PayoutCryptocurrencyAccount.md) | Cryptocurrency account data *(for BITCOIN payment method only)* |  [optional]
**customer** | [**PayoutCustomer**](PayoutCustomer.md) | Customer data |  [optional]
**ewalletAccount** | [**PayoutEWalletAccount**](PayoutEWalletAccount.md) | eWallet account data *(for NETELLER, WEBMONEY and QIWI payment methods only)* | 
**merchantOrder** | [**PayoutMerchantOrder**](PayoutMerchantOrder.md) | Merchant order | 
**paymentData** | [**PayoutPaymentData**](PayoutPaymentData.md) | Payment data |  [optional]
**paymentMethod** | **String** | Used payment method type name from payment methods list | 
**payoutData** | [**PayoutData**](PayoutData.md) | Payout data | 



