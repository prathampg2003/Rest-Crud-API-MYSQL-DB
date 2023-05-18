_**REST API using Spring Boot with MySQL Database**_

**Rest API made using spring boot that takes data in JSON format and stores in mysql database.**


1. GET /departments    //get all the data 
2. GET /departments/{id}  //get using id
3. POST /departments
4. DELETE /departments/{id}
5. PUT  /departments/{id}
6. PATCH /departments/{id}/{deptname}

To test the API, you can use tools like Postman, cURL, or any HTTP client of your choice. Send HTTP requests to the defined endpoints, passing the required data in the request body or query parameters.

For example, to create a new resource, send a POST request to http://localhost:8080/departments with the resource data in the request body.

Similarly, use other HTTP methods (GET, PUT, DELETE,PATCH,POST) to interact with the API and manipulate the stored data.

