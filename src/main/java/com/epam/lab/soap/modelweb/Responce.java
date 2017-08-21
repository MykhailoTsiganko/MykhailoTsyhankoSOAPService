package com.epam.lab.soap.modelweb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Responce<T> {
    private  T result;
    private String responceMessage;
    private String responceMessageCode;

    public Responce() {}

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getResponceMessage() {
        return responceMessage;
    }

    public void setResponceMessage(String responceMessage) {
        this.responceMessage = responceMessage;
    }

    public String getResponceMessageCode() {
        return responceMessageCode;
    }

    public void setResponceMessageCode(String responceMessageCode) {
        this.responceMessageCode = responceMessageCode;
    }
}
