package com.dunky.springboot.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}