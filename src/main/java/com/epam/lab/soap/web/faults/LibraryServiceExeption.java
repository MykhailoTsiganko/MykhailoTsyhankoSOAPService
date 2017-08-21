package com.epam.lab.soap.web.faults;

import javax.xml.ws.WebFault;

@WebFault
public class LibraryServiceExeption extends  Exception {
    public LibraryServiceExeption(String message){
        super(message);
    }


}
