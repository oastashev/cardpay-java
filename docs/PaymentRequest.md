
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**Request**](Request.md) | Request | 
**cardAccount** | [**CardAccount**](CardAccount.md) | Information about card *(for BANKCARD payment method only)* | 
**cryptocurrencyAccount** | [**CryptocurrencyAccount**](CryptocurrencyAccount.md) | Cryptocurrency data *(for BITCOIN payment method only)* |  [optional]
**customer** | [**Customer**](Customer.md) | Information about customer. | 
**ewalletAccount** | [**EWalletAccount**](EWalletAccount.md) | Wallet data *(for QIWI and NETELLER payment methods only)* |  [optional]
**merchantOrder** | [**PaymentMerchantOrder**](PaymentMerchantOrder.md) | merchant order data | 
**paymentData** | [**PaymentData**](PaymentData.md) | Information for payment. | 
**paymentMethod** | **String** | Used payment method type name from payment methods list. Leave empty for redirect customer to Checkout Page |  [optional]
**returnUrls** | [**ReturnUrls**](ReturnUrls.md) | Return URLs are the URLs where customer returns by pressing &#39;Back to the shop&#39; or &#39;Cancel&#39; button in Payment Page mode and redirected automatically in Gateway mode |  [optional]



