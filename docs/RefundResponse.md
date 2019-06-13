
# RefundResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardAccount** | [**RefundCardAccount**](RefundCardAccount.md) | Card account data *(for BANKCARD payment method only)* |  [optional]
**customer** | [**RefundCustomer**](RefundCustomer.md) | Customer data |  [optional]
**ewalletAccount** | [**EWalletAccount**](EWalletAccount.md) | eWallet account data *(for QIWI and ALIPAY payment methods only)* |  [optional]
**paymentData** | [**RefundPaymentData**](RefundPaymentData.md) | Payment data | 
**refundData** | [**ResponseRefundData**](ResponseRefundData.md) | Refund data | 
**paymentMethod** | **String** | Used payment method type name from payment methods list |  [optional]
**merchantOrder** | [**MerchantOrder**](MerchantOrder.md) | Merchant order data |  [optional]



