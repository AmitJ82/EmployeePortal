# EmployeePortal
Employee Portal to register and list employees
Clone the application 
Build with maven
run Jar suing java -jar

To Test use Postman Configure following with below test data
http://localhost:8080/registerEmployee

Endpoint: /registerEmployee
Request Method: HTTP POST
{"firstName":"Amit","lastName":"Joshi","gender":"M","dob":"12 Jan 1982","department":"IT"}

Response:
{"id": "1","firstName":"Amit","lastName":"Joshi","gender":"M","dob":"12 Jan 1982","department":"IT"}

http://localhost:8080/listEmployees

Endpoint: /listEmployees
Method: HTTP GET
Response:
[{"id":1,"firstName":"Amit","lastName":"Joshi","gender":"M","dob":"12 Jan 1982","department":"IT"},{"id":2,"firstName":"Sumit","lastName":"Joshi","gender":"M","dob":"12 Jan 1983","department":"IT"}]

Swagger support is included
/v2/api-docs lists the apis available
http://localhost:8080/swagger-ui.html#/employee-controller lists the available apis to try out




