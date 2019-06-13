package com.cardpay.sdk;

public class Config {

    public static final String CARDPAY_API_URL = System.getProperty("CARDPAY_API_URL", "https://sandbox.cardpay.com");

    public static final String PAYMENTPAGE_TERMINAL_CODE = System.getProperty("PAYMENTPAGE_TERMINAL_CODE", "18397");
    public static final String PAYMENTPAGE_PASSWORD = System.getProperty("PAYMENTPAGE_PASSWORD", "FpK2cy143POj");

    public static final String GATEWAY_TERMINAL_CODE = System.getProperty("GATEWAY_TERMINAL_CODE", "18399");
    public static final String GATEWAY_PASSWORD = System.getProperty("GATEWAY_PASSWORD", "jehE149L7bHU");

    public static final String SUCCESS_URL = "https://httpbin.org/get?result=success";
    public static final String DECLINE_URL = "https://httpbin.org/get?result=decline";
    public static final String CANCEL_URL = "https://httpbin.org/get?result=cancel";
    public static final String INPROCESS_URL = "https://httpbin.org/get?result=inprocess";
}