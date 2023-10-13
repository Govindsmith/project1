package com.customer.ms.test;

import com.customer.ms.exception.CustomerInsufficent;
import com.customer.ms.exception.CustomerInvalidNameException;
import com.customer.ms.exception.CustomerNotFoundException;
import com.customer.ms.exception.InvalidIdException;
import com.customer.ms.service.CustomerServiceImpl;
import com.customer.ms.service.ICustomerService;

public class CustomerTest {

    public static void main(String[] args) {

        ICustomerService customerService=new CustomerServiceImpl();
        try{
            customerService.register("karthik", "kumar");
            customerService.register("Asish", "gopan");
            customerService.register("komal", "komala");
            customerService.findById(2);
            customerService.findCustomersByfirstNameAscendingId("Govi");



        }catch (CustomerInvalidNameException e){
            System.out.println(e.getMessage());
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        } catch (CustomerInsufficent e) {
            System.out.println(e.getMessage());
        }

    }
}
