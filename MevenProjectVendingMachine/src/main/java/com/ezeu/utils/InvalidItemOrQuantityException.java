package com.ezeu.utils;

public class InvalidItemOrQuantityException extends RuntimeException{
    public InvalidItemOrQuantityException(String errorMessage) {
        super(errorMessage);
    }
}
