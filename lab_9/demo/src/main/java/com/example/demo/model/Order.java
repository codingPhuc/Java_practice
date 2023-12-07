package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderNumber;
    private double totalSellingPrice;

    @ManyToMany
    @JoinTable(
            name = "OrderProduct",
            joinColumns = @JoinColumn(name = "Order_Id"),
            inverseJoinColumns = @JoinColumn(name = "Product_Id"))
    private List<Product> productList;


}
