/**
 * Copyright 2016-02-16 the original author or authors.
 */
package com.lufthansa.order.util;

import javax.jms.BytesMessage;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public class MessageConverter {

    public static String convertBytesMessage(BytesMessage message) {
        return convertBytesMessage(message, "UTF-8");
    }

    public static String convertBytesMessage(BytesMessage message, String encoding) {

        if(message instanceof BytesMessage) {

            BytesMessage byteMessage = (BytesMessage) message;
            try {
                byte[] byteArr = new byte[(int)byteMessage.getBodyLength()];
                byteMessage.readBytes(byteArr);
                String msg = new String(byteArr, encoding);

               return msg;

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else {
            throw new IllegalArgumentException("not a BytesMessage");
        }

    }

}
