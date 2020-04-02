package com.task.crud.Repository;
import com.task.crud.User.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Customer, String> {
}
