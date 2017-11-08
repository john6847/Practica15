package com.pucmm.practica15.Servicios;


import com.pucmm.practica15.Entidades.Customer;
import com.pucmm.practica15.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> customerList(){
        return customerRepository.findAll();
    }

    public Customer guardar(Customer customer){

        return customerRepository.save(customer);

    }

    public void deleteCustomer(long id){
        customerRepository.delete(id);
    }


 }
