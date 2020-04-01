package com.task.crud.Repository;
import com.task.crud.User.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Customer save(Customer emp) {
        return orderRepository.save(emp);
    }


    /* search all employees*/

    public List<Customer> findAll() {
        return orderRepository.findAll();
    }


    /*delete an employee*/

    public void delete(Customer emp) {
        orderRepository.delete(emp);
    }
}