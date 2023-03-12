package com.swansong.msnotificationservice.service;

import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    public void sendEmail(String orderNumber) {
        System.out.println("Order Placed. Sent email. Order #:"+orderNumber);
    }
}
