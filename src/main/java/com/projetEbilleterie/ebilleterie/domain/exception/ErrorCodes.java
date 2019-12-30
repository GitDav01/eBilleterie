package com.projetEbilleterie.ebilleterie.domain.exception;

public final class ErrorCodes {

    private ErrorCodes() {}
    public static final String NOT_FOUND = " ERR_0001 ";
    public static final String PROVIDER_NOT_FOUND = NOT_FOUND + " ERR_0002 ";


    public static final String BASKET_NOT_FOUND = NOT_FOUND + " ERR_0012 ";
    public static final String BASKET_MUST_HAVE_A_CATEGORY = " ERR_0013 ";
    public static final String BASKET_MUST_HAVE_A_REFERENCE = " ERR_0014 ";

    public static final String ETICKET_NOT_FOUND = NOT_FOUND + " ERR_0022 ";
    public static final String ETICKET_MUST_HAVE_A_CATEGORY = " ERR_0023 ";
    public static final String ETICKET_MUST_HAVE_A_REFERENCE = " ERR_0024 ";

    public static final String CUSTOMER_NOT_FOUND = NOT_FOUND + " ERR_0032 ";
    public static final String CUSTOMER_MUST_HAVE_A_CATEGORY = " ERR_0033 ";
    public static final String CUSTOMER_MUST_HAVE_A_REFERENCE = " ERR_0034 ";

    public static final String RELATIVE_NOT_FOUND = NOT_FOUND + " ERR_0042 ";
    public static final String RELATIVE_MUST_HAVE_A_CATEGORY = " ERR_0043 ";
    public static final String RELATIVE_MUST_HAVE_A_REFERENCE = " ERR_0044 ";

}
