package com.epam.lab.soap.web.faults;

import javax.xml.ws.WebFault;

@WebFault(name = "LibraryFault")
public class ServiceException extends  Exception {
    private ServiceFaultInfo serviceFaultInfo;

    public ServiceException(ServiceFaultInfo serviceFaultInfo){
        this.serviceFaultInfo = serviceFaultInfo;
    }

    public ServiceFaultInfo getServiceFaultInfo() {
        return serviceFaultInfo;
    }

    public void setServiceFaultInfo(ServiceFaultInfo serviceFaultInfo) {
        this.serviceFaultInfo = serviceFaultInfo;
    }
}
