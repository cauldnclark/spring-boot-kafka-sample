package com.example.springboot;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class HelloController {

	@Autowired
	private KafkaTemplate<String, Email> kafkaTemplate;

	@GetMapping("/")
	public String index() {
		kafkaTemplate.send("email_send", new Email("test subject", "<h1>THIS IS UNIORTHOLAB</h1>", "support@uniortholab.com", "jc@moonalignersystem.com"));

		return "Greetings from Spring Boot!";
	}

}
