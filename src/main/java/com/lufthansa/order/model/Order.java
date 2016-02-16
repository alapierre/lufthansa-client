/**
 * Copyright 2016-02-16 the original author or authors.
 */
package com.lufthansa.order.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max = 128)
    private String orderNumber;

    @OrderBy("id")
    @OneToMany
    @JoinColumn(name = "order_id")
    private Set<OrderItem> orders;

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
