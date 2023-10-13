package com.customer.ms.exception;

import com.customer.ms.service.CustomerServiceImpl;
import com.customer.ms.service.ICustomerService;

public class CustomerInvalidNameException  extends Exception {
    public CustomerInvalidNameException(String msg){
        super(msg);

    }
}
