package com.task.crud.User;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString
@Entity
@NoArgsConstructor
public class Receipient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(targetEntity = BasicProfile.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Basic_Profiles", referencedColumnName = "Id")
    private BasicProfile basicProfile;
    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Addresses", referencedColumnName = "Id")
    private List<Address> addresses;
}

