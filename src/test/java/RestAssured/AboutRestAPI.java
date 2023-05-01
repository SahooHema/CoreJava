package RestAssured;

public class AboutRestAPI {
/*
Rest Assured:- it is an api through which we can automate rest api's..
pre-requiste:- java, eclipse,TestNG
dependencies:-
rest-assured
json-path
json
gson
scribejava-api(it is use to create random test datai.e.dynamic data)
json-schema-validator
xml-schema-validator
	
Rest Assured bydeafult use BDD and keyword:- Given, when , Then	
Given:-set cookies,content type, add auth, add param,set headers etc..
When:- GET,POST,PUT,DELETE
Then:-validations i.e. status code,extract response,extract headers cookies and response body	
	
note:-When write api's test i.e. with given, when, then keywords then need to import static packages from rest asssured website with heading i.e. static import
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

HTTP Requests:-
GET-> https://reqres.in/api/users?page=2
POST-> https://reqres.in/api/users
{
    "name": "morpheus", 
    "job": "leader"
}	
PUT-> https://reqres.in/api/users/2	
{
    "name": "morpheus", 
    "job": "zion resident"
}	
DELETE-> https://reqres.in/api/users/2	
	
	
Different ways to create request body for POST Request
1.Hashmap but pass harcoded data
2.using org.json(need to add dependency)
3.by using pojo(plain old java object) class	
4.using external json file	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
}
