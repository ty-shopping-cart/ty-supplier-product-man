# Supplier Product Management

## Tech Stack
* Java JDK 11
* Maven 3.8.1
* Spring Boot v2.9.2
* Kafka 2.8.0

## Running the Application
####Build the app
`mvn clean install`

###Download and Install Kafka
https://kafka.apache.org/downloads
Windows : https://www.youtube.com/watch?v=EUzH9khPYgs

###Start Kafka
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

Create Test Topic:
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic TestTopic

## Application Details

Once application is up, api documentation can be seen at `http://localhost:8085/swagger-ui.html`

### Sample Endpoint

#### [POST] /products/ (createProduct.)

Body: 
{
  "barcode": "A123B456C",
  "categoryId": 1,
  "imageURL": "product1.jpg",
  "price": 100.0,
  "stock": 500,
  "title": "Mavi Gomlek"
}

