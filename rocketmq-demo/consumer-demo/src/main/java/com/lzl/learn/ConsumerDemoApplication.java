package com.lzl.learn;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class ConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerDemoApplication.class, args);
	}

	@Service
	@RocketMQMessageListener(topic = "demo-topic",consumerGroup = "demo-group")
	public class MyConsumer implements RocketMQListener<String> {

		@Override
		public void onMessage(String message) {
			System.out.printf(message);
		}
	}

}
