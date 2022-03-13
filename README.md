# springboot-ehcache-demo

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/springboot-ehcache-demo.git`
2. Navigate to the folder: `cd springboot-ehcache-demo`
3. Run the application: `mvn clean spring-boot:run`
4. Open your POSTMAN APP then import the file

### Image Screen shot

Add New Employee

![Add New Employee](img/add.png "Add New Employee")

```shell
curl --location --request POST 'http://localhost:8080/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Uchiha Sasuke",
    "tech": "Tim 1"
}'
```

List All Employee

![List All Employee](img/list.png "List All Employee")

![List All Employee](img/list2.png "List All Employee")

```shell
curl --location --request GET 'http://localhost:8080/employee' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Uzumaki Naruto",
    "tech": "Tim 1"
}'
```

Find Employee By ID

![Find Employee By ID](img/byid.png "Find Employee By ID")

```shell
curl --location --request GET 'http://localhost:8080/employee/1'
```

Evict the Cache

![Evict the Cache](img/evict.png "Evict the Cache")

```shell
curl --location --request GET 'http://localhost:8080/employee/evict'
```
