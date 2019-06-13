
# PaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethod** | **String** | Used payment method type name from payment methods list |  [optional]
**merchantOrder** | [**MerchantOrder**](MerchantOrder.md) | Merchant order data |  [optional]
**paymentData** | [**PaymentData**](PaymentData.md) | Payment data |  [optional]
**cardAccount** | [**CardAccount**](CardAccount.md) | Card account data *(for BANKCARD payment method only)* |  [optional]
**cryptocurrencyAccount** | [**CryptocurrencyAccount**](CryptocurrencyAccount.md) | Cryptocurrency account data *(for BITCOIN payment method only)* |  [optional]
**ewalletAccount** | [**EWalletAccount**](EWalletAccount.md) | eWallet account data *(for ALIPAY, QIWI, WEBMONEY and NETELLER payment methods only)* |  [optional]
**customer** | [**Customer**](Customer.md) | Customer data |  [optional]



