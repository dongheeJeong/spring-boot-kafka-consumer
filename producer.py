# pip3 install kafka
# or
# pip3 install kafka-python
from kafka import KafkaProducer
from time import gmtime, strftime
from time import sleep
import json

topic = 'test'
producer = KafkaProducer(bootstrap_servers='192.168.25.20:9092')

while True:
    timestamp = strftime("%Y-%m-%d %H:%M:%S", gmtime())
    obj = {'timestamp':timestamp, 'name':'donghee'}

    #print(obj)
    producer.send(topic, json.dumps(obj).encode())
    producer.flush()
    sleep(1)
