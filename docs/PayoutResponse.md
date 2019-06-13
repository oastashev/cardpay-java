
# PayoutResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardAccount** | [**PayoutCardAccount**](PayoutCardAccount.md) | Card account data *(for BANKCARD payment method only)* |  [optional]
**cryptocurrencyAccount** | [**PayoutCryptocurrencyAccount**](PayoutCryptocurrencyAccount.md) | Cryptocurrency account data *(for BITCOIN payment method only)* |  [optional]
**customer** | [**PayoutCustomer**](PayoutCustomer.md) | Customer data |  [optional]
**ewalletAccount** | [**PayoutEWalletAccount**](PayoutEWalletAccount.md) | eWallet account data *(for NETELLER, WEBMONEY and QIWI payment methods only)* |  [optional]
**paymentData** | [**PayoutPaymentData**](PayoutPaymentData.md) | Payment data |  [optional]
**payoutData** | [**PayoutData**](PayoutData.md) | Payout data | 
**paymentMethod** | **String** | Used payment method type name from payment methods list |  [optional]
**merchantOrder** | [**MerchantOrder**](MerchantOrder.md) | Merchant order data |  [optional]



