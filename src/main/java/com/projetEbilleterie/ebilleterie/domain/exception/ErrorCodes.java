package com.projetEbilleterie.ebilleterie.domain.exception;

public final class ErrorCodes {

    private ErrorCodes() {}
    public static final String NOT_FOUND = "ERR_0001";
    public static final String PROVIDER_NOT_FOUND = NOT_FOUND + "ERR_0002";
    public static final String BASKET_NOT_FOUND = NOT_FOUND + "ERR_0012";
    public static final String ETICKET_NOT_FOUND = NOT_FOUND + "ERR_0022";
}
