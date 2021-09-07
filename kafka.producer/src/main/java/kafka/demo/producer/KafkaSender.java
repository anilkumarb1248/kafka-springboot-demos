package kafka.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import kafka.demo.model.Employee;

@Component
public class KafkaSender {

	@Autowired
	KafkaTemplate<String, Employee> kafkaTemplate;

	private static final String TOPIC_NAME = "employee-data";

	public String sendToKafka(Employee employee) {

		String response = "Employee details send to Kafka successfully";
		//kafkaTemplate.send(TOPIC_NAME, "Employee name: " + employee.getName());
		kafkaTemplate.send(TOPIC_NAME, employee);
//		, new Callback() {
//			@Override
//			public void onCompletion(RecordMetadata metadata, Exception e) {
//				if (e == null) {
//					response = "Employee details send to Kafak successfully";
//				} else {
//					response = "Failed to send Employee details to Kafka";
//				}
//			}
//		});

		return response;
	}

}
