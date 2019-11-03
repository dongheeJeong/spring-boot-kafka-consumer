# spring-boot-kafka-consumer
simple spring-boot kafka consumer.
kafka server can be initiated simply by [kafka-docker](https://github.com/wurstmeister/kafka-docker).

producer : producer.py / consumer : spring-boot kafka consume listener

## short kafka-docker running command
```
git clone https://github.com/wurstmeister/kafka-docker.git
cd kafka-docker

# edit docker-compose-single-broker.yml file
# specifically KAFKA_ADVERTISED_HOST_NAME

# execute
docker-compose -f docker-compose-single-broker.yml up
```
