package com.task.crud.User;
import lombok.Data;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Entity
public class Customer implements Serializable {
    @Id
    private String orderId;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Product")
    private List<Product> products;
    @OneToOne(targetEntity = Receipient.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "Receipient")
    private Receipient receipient;
}