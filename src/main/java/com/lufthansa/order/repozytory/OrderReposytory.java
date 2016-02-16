/**
 * Copyright 2016-02-16 the original author or authors.
 */
package com.lufthansa.order.repozytory;

import com.lufthansa.order.model.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Repository
public interface OrderReposytory extends CrudRepository<Order, Integer> {

}
