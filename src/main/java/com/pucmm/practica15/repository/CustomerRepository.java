package com.pucmm.practica15.repository;


import com.pucmm.practica15.Entidades.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findAll();
    Customer save(Customer customer);
    void deleteById(long id);

    List<Customer> findByLastNameStartsWithIgnoreCase(String filterText);

}
