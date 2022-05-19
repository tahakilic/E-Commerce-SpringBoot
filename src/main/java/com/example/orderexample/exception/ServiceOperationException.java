package com.example.orderexample.exception;

public class ServiceOperationException {

    public ServiceOperationException() {
    }

    public static class CustomerNotFoundException extends BaseException{
        public CustomerNotFoundException(String message){
            super(message);
        }
    }

}
