package com.customer.ms.service;

import com.customer.ms.domain.Customer;

import java.util.Comparator;


public class SortedByIdComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getId()-o2.getId();
    }
}
