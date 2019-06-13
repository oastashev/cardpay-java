
# PaymentUpdateTransactionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The total transaction amount in selected currency with dot as a decimal separator, must be less than 100 millions | 
**statusTo** | [**StatusToEnum**](#StatusToEnum) | Payment: &#x60;COMPLETE&#x60; or &#x60;REVERSE&#x60; status to be set.  Refund, payout: &#x60;REVERSE&#x60; status to be set.  *(for BANKCARD payment method only)* |  [optional]


<a name="StatusToEnum"></a>
## Enum: StatusToEnum
Name | Value
---- | -----
COMPLETE | &quot;COMPLETE&quot;
REVERSE | &quot;REVERSE&quot;



