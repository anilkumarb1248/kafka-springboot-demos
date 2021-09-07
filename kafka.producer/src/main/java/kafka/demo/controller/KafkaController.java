package kafka.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.demo.model.Employee;
import kafka.demo.producer.KafkaSender;

@RestController
@RequestMapping("/producer")
public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping("/send/{name}")
	public String createEmployee(@PathVariable("name") String name) {
		Employee employee = new Employee(new Random().nextLong(), name, new Random().nextDouble());
		return kafkaSender.sendToKafka(employee);
	}

}
