package com.epam.lab.soap.web.faults;


public enum FaultMessageExpression {
    NO_BOOK_WITH_NAME("There are no book with  name [%s]");

    private String messageExpression;
    private FaultMessageExpression(String messageExpression) {
        this.messageExpression = messageExpression;
    }
    public String getMessageExpression(){
        return this.messageExpression;
    }
}
