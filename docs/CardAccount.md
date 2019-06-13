
# CardAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingAddress** | [**BillingAddress**](BillingAddress.md) | Billing Address |  [optional]
**card** | [**Card**](Card.md) | Represents a payment card, shouldn&#39;t be used in Payment Page mode |  [optional]
**expiration** | **String** | Customer’s card expiration date. Returned only if setting &#39;Callback: card expiry&#39; in a wallet in PM system is ON |  [optional]
**holder** | **String** | Customer&#39;s cardholder name. Any valid cardholder name, Not present by default, ask CardPay manager to enable it if needed |  [optional]
**issuingCountryCode** | **String** | Country code of issuing card country |  [optional]
**maskedPan** | **String** | Masked PAN (shows first 6 digits and 4 last digits) |  [optional]
**token** | **String** | Card token value used instead of card information. For payment: see PaymentData for token generation. For recurrings: this attribute is valid only for first recurring payment. It isn&#39;t valid for continue recurring payments (with filing id), see RecurringData for token generation. |  [optional]



