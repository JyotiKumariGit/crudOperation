package com.task.crud.Controller;
import com.task.crud.Repository.OrderService;
import com.task.crud.User.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class ControllerClass {

    @Autowired
    OrderService orderService;

    @PostMapping("/customers")
    public Customer createEmployee(@Valid @RequestBody Customer emp) {
        return orderService.save(emp);
    }

    @GetMapping("/customers")
    public List<Customer> getAllEmployees(){
        return orderService.findAll();
    }

    @GetMapping("/customers/{id}")
    public String getEmployeeById(@PathVariable(value="id") String empid){

        String emp=orderService.getOne(empid).toString();

        if(emp==null) {
            return "Not Found";
        }
        return emp;
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customer> deleteEmployee(@PathVariable(value="id") String empid){

        Customer emp=orderService.getOne(empid);
        if(emp==null) {
            return ResponseEntity.notFound().build();
        }
        orderService.delete(emp);

        return ResponseEntity.ok().build();


    }

}
