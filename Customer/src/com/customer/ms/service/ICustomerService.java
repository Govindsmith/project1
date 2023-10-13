package com.customer.ms.service;

import com.customer.ms.domain.Customer;
import com.customer.ms.exception.CustomerInsufficent;
import com.customer.ms.exception.CustomerInvalidNameException;
import com.customer.ms.exception.CustomerNotFoundException;
import com.customer.ms.exception.InvalidIdException;

import java.util.List;

public interface ICustomerService {


    Customer register(String firstName, String lastName) throws CustomerInvalidNameException;
    Customer findById(int id) throws InvalidIdException, CustomerNotFoundException;

    List<Customer> findCustomersByfirstNameAscendingId(String firstName) throws CustomerInsufficent, CustomerNotFoundException;
}
