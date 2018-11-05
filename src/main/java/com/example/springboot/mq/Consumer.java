package com.example.springboot.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);
    @JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text){
        log.info("Has received from mytest.queue"+",msg:"+text);
    }
}
