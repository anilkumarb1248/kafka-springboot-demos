# kafka-springboot-demos
Kafka integration with spring boot

# Kafka Installation
https://www.javatpoint.com/installation-of-apache-kafka

# Start the ZooKeeper
zookeeper-server-start.bat config\zookeeper.properties

# Start the Kafka Server
zookeeper-server-start.bat config\zookeeper.properties

# Creating the required topics
kafka-topics --zookeeper localhost:2181 --create --topic employee-data --partitions 2 --replication-factor 1

kafka-topics --zookeeper localhost:2181 --create --topic string-messages --partitions 2 --replication-factor 1

# Starting Producers from the console
kafka-console-producer.bat --broker-list localhost:9092 --topic employee-data

kafka-console-producer.bat --broker-list localhost:9092 --topic string-messages

# Starting Consumers from the console
kafka-console-producer.bat --broker-list localhost:9092 --topic string-messages

kafka-console-producer.bat --broker-list localhost:9092 --topic employee-data

# Testing
Run the Producer and Consumer applications and hit the below URL from the browser
http://localhost:2021/KafkaProducer/producer/send/TestUser
