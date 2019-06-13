
# PaymentCreationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**redirectUrl** | **String** | URL a Customer should be redirected to |  [optional]
**paReq** | **String** | Bank authentication request |  [optional]
**MD** | **String** | Merchant Data |  [optional]
**customer** | [**Customer**](Customer.md) | Customer data |  [optional]
**paymentData** | [**PaymentData**](PaymentData.md) | Payment data |  [optional]
**cardAccount** | [**CardAccount**](CardAccount.md) | Card account data *(for BANKCARD payment method only)* |  [optional]
**cryptocurrencyAccount** | [**CryptocurrencyAccount**](CryptocurrencyAccount.md) | Cryptocurrency account data *(for BITCOIN payment method only)* |  [optional]
**ewalletAccount** | [**EWalletAccount**](EWalletAccount.md) | eWallet account data *(for ALIPAY, QIWI, WEBMONEY and NETELLER payment methods only)* |  [optional]



