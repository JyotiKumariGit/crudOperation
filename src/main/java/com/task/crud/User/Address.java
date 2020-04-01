package com.task.crud.User;
import javax.persistence.Entity;
import lombok.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class Address implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String country;
}