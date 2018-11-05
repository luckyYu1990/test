package com.example.springboot;

import com.example.springboot.mq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Autowired
	private Producer producer;
	@Test
	public void contextLoads() {
	//	Destination destination = new ActiveMQQueue("mytest.queue");
		for(int i=0;i<100;i++){
			producer.sendMessage("hahahah");
		}
	}

}
