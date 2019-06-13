
# PaymentMerchantOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of product/service being sold | 
**flights** | [**Flights**](Flights.md) | Flights data *(for BANKCARD payment method only)* |  [optional]
**id** | **String** | Order ID used by the merchant&#39;s shopping cart | 
**items** | [**List&lt;Item&gt;**](Item.md) | List of order positions (items in the shopping cart) |  [optional]
**shippingAddress** | [**ShippingAddress**](ShippingAddress.md) | Shipping address is the address where the order will be delivered.  It is used in Anti-fraud System and also can be seen in Merchant Account (Transactions).  But this address field may be omitted and all the subfields inside it may be omitted too except Country. |  [optional]



