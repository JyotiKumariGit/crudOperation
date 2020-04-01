package com.task.crud.Controller;
import com.task.crud.Repository.OrderService;
import com.task.crud.User.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class ControllerClass {

    @Autowired
    OrderService orderService;

    /* to save an employee*/
    @PostMapping("/employees")
    public Customer createEmployee(@Valid @RequestBody Customer emp) {
        return orderService.save(emp);
    }

    /*get all employees*/
    @GetMapping("/employees")
    public List<Customer> getAllEmployees(){
        return orderService.findAll();
    }


}