
# RecurringCustomer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Customer&#39;s e-mail address |  [optional]
**id** | **String** | Customer&#39;s ID in the merchant&#39;s system | 
**locale** | [**LocaleEnum**](#LocaleEnum) | Preferred locale for the payment page ([ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1) language code). The default locale will be applied if the selected locale is not supported. Supported locales are: &#x60;ru&#x60;, &#x60;en&#x60;, &#x60;zh&#x60;, &#x60;ja&#x60; |  [optional]
**phone** | **String** | Customer phone number |  [optional]


<a name="LocaleEnum"></a>
## Enum: LocaleEnum
Name | Value
---- | -----
RU | &quot;ru&quot;
EN | &quot;en&quot;
ZH | &quot;zh&quot;
JA | &quot;ja&quot;



