package com.lufthansa.order;

import com.lufthansa.order.repozytory.OrderReposytory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OrderCondumerApplication.class)
@WebAppConfiguration
public class OrderCondumerApplicationTests {

	@Autowired
	private OrderReposytory reposytory;

	@Test
	public void contextLoads() {

		reposytory.findAll();

	}

}
