/**
 * Copyright 2016-02-16 the original author or authors.
 */
package com.lufthansa.order.listener;

import com.lufthansa.order.util.MessageConverter;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import pl.com.softproject.lilu.model.order.Order;
import pl.szkolenie.orders.OrderSerializer;

import javax.jms.BytesMessage;
import javax.jms.Message;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Component
public class OrderListener {

    @JmsListener(destination = "test.queue")
    public void processMessage(Message message) {

        System.out.println("wiadomość !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println(message.getClass());

        if(message instanceof BytesMessage) {
            System.out.println("wiadomość bajtowa");
            String str = MessageConverter.convertBytesMessage((BytesMessage)message);
            System.out.println(str);

            OrderSerializer serializer = new OrderSerializer();

            Order order = serializer.fromString(str);

            System.out.println(order.getOrderId());

        }

    }

}
