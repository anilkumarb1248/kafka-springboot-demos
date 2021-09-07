package kafka.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import kafka.demo.model.Employee;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "string-messages", groupId = "string-values")
	public void consumeStringMessages(String message) {
		System.out.println("Consumed String Message: " + message);
	}

	@KafkaListener(topics = "employee-data", groupId="json-values", containerFactory = "employeeKafkaListenerContainerFactory")
	public void consumeEmployeesData(Employee employee) {
		System.out.println("Consumed Employee details: "+ employee);
	}

}
