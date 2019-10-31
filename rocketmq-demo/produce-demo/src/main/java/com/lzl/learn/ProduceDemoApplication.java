package com.lzl.learn;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class ProduceDemoApplication implements CommandLineRunner {

	@Resource
	RocketMQTemplate rocketMQTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProduceDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 普通发送
		rocketMQTemplate.convertAndSend("demo-topic","hello world!");

	}
}
