package kafkaspringtutorial.demo.service;

import kafkaspringtutorial.demo.model.SimpleObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Receiver {

    @KafkaListener(topics = "test", containerFactory = "kafkaListenerContainerFactory")
    public void listen(SimpleObj simpleObj) {
        logger.info("received message='{}'", simpleObj.toString());
    }
}
