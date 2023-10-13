package com.customer.ms.service;

import com.customer.ms.domain.Customer;
import com.customer.ms.exception.CustomerInsufficent;
import com.customer.ms.exception.CustomerInvalidNameException;
import com.customer.ms.exception.CustomerNotFoundException;
import com.customer.ms.exception.InvalidIdException;

import java.util.*;

import static java.util.Collections.*;

public class CustomerServiceImpl implements ICustomerService{
    Map<Integer,Customer> store=new LinkedHashMap<>();
    int index=0;
    int generateId(){
        return ++index;

    }

    @Override
    public Customer register(String firstName, String lastName) throws CustomerInvalidNameException {
        int id= generateId();
        //Customer customer[]=new Customer[10];
        if ((firstName.length()>2&& firstName.length()<10) && ((lastName.length() >2 && lastName.length()<10))){
            store.put(id, new Customer(id, firstName, lastName));
            System.out.println("customer:"+"id= "+id+",First name="+firstName+",last name="+lastName);
            return store.get(id);
        }else
            throw new CustomerInvalidNameException("InvalidName");

        //return customer[id];
       // return  null;
    }

    @Override
    public Customer findById(int id) throws InvalidIdException, CustomerNotFoundException {
        if(id<1){
            throw new InvalidIdException("InvalidID");
        }

    Customer customer=new Customer();
        customer=store.get(id);

        if(customer==null){
            throw new CustomerNotFoundException("customer not found");
        }
        System.out.println("customer:"+"id= "+id+",First name="+customer.getFristName()+",last name="+customer.getLastName());
        return customer;
    }

    @Override
    public List<Customer> findCustomersByfirstNameAscendingId(String firstName) throws CustomerInsufficent, CustomerNotFoundException {
        if (firstName.length()<3) {
            throw new CustomerInsufficent("insufficient text for search");
        }
        List<Customer> customerList=new ArrayList<>();
        for(Customer customer:store.values()){
            if(customer.getFristName().toLowerCase().startsWith(firstName.toLowerCase())){
                System.out.println("customer:"+"id= "+customer.getId()+",First name="+customer.getFristName()+",last name="+customer.getLastName());
               customerList.add(customer);
            }
        }
        if(customerList.size()==0){
            throw new CustomerNotFoundException("Customer not found");
        }
        customerList.sort((new SortedByIdComparator()));
        return customerList;
    }
}
