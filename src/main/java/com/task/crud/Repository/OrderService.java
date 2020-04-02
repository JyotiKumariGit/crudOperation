package com.task.crud.Repository;
import com.task.crud.User.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Customer save(Customer emp) {
        return orderRepository.save(emp);
    }

    public List<Customer> findAll() {
        return orderRepository.findAll();
    }


    public Customer getOne(String empid) {
        return orderRepository.getOne(empid) ;
    }

    public void delete(Customer emp) {
        orderRepository.delete(emp);
    }
}