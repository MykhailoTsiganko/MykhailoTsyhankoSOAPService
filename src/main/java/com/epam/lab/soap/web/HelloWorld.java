package com.epam.lab.soap.web;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

