package com.example.springboot.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;

@Service
public class Producer implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(Producer.class);
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue logQueue;
    public void sendMessage( String message){
        jmsMessagingTemplate.convertAndSend(this.logQueue,message);
    }

    @Override
    public void run(String... args) throws Exception {
        sendMessage("this is a log message");
        log.info("log message was sent to the Queue named sample.log");
    }

}
