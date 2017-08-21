package com.epam.lab.soap.web.faults;

public class ServiceFaultInfo {

    private String message;

    public ServiceFaultInfo(FaultMessageExpression expression, Object ...args ){
        setMessage(String.format(expression.getMessageExpression(), args));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
