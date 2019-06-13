
# PayoutCardAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingAddress** | [**BillingAddress**](BillingAddress.md) | Address for billing |  [optional]
**card** | [**PayoutCard**](PayoutCard.md) | Represents a payout card, required if &#x60;card_account.token&#x60; element isn&#39;t presented | 
**recipientInfo** | **String** | Property &#x60;recipient_info&#x60; may be required by Bank. In most cases it&#39;s Cardholder&#39;s name, contact CardPay manager for requirements. It must be omitted when property &#x60;token&#x60; is presented | 
**token** | **String** | Card token value, used instead of a card data |  [optional]



