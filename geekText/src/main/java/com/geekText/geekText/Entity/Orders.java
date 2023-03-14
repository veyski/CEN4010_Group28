package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @Column(name = "OrderID")
    @GeneratedValue
    private int OrderID;


    @Column(name = "Order Quantity")
    private int orderQuantity;

    @Column(name = "Total Price")
    private float totalPrice;

}