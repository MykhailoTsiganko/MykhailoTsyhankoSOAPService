
package com.epam.lab.soap.web;

import javax.jws.WebService;

@WebService(endpointInterface = "com.epam.lab.soap.web.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

