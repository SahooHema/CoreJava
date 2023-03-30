package API;

public class DefinitionOfAPis {

	public static void main(String[] args) {
	
		
	/*	
	
	API:- it is an interface between two software applications..
	eg: waiter is an interface b/w customer and chef
/////////	
	Types of API's:-
	SOAP,XML,JSON,REST
////////////////////	//////////
	Why to perfoem API testing?
	nowdays , there are millions of API's , available i.e. fb, instagram etc.. need to test it thoroughly..
	dev create buggy API's which need to test it..
////////////	
	What to test in API;s
	status code
	Response time
	data size
	body
	cookies
	headers	
	////////////////////
	Difference between SOAP(SIMPLE OBJECT ACCESS PROTOCOL) & REST(REPRESENTATIONAL STATE TRANSFER)?
	SOAP:- it used WSDL(web services decription language) to communicate b/w consumr and provider
	it is XML msg based potocol
	transfer via htts, ftp and smtp
	javascript can call soap but difficult to implement
	Performance is not good compared to REST 
	Does npt return human readbale results
	call services via. RPC methods
	Note: for bank, password, credit card soap is useful..
	
	
	REST:- it is archtechural style protocol
	it uses xml, json to send and receive data
	javascript can call REST
	transfer via HTTPS,
	performance is good , less CU utilization
	call services via URL..
	
eg: linkedin, instagram, twitter etcc...
	
/////////////////////
 Different consraints in REST API's
1.  uniform interface:- client and server need to follow certain rules to communicate i.e. follow json,xml,html,text..
2.  stateless:- server will not remember the client which request it send.. 
3. cashable:- server might respond with cacheble..(it savea sthe responses it send)..	
4. 	layered system:- we can add multiple of layers b/w client and server..i.e. ssl etc..
	
	
///////////////////////////////
 GET: to retrive data from server
 POST:to create resource in server
 PUT: to update all existing data(RESOURCE) in db
 PATCH: partial update existing data in db
 DELETE: to delete resource from db
 OPTIONS: query certain otpions
	
	
//Types of status code:-
 1.200- successful
 2.201:-created
 3.202:- Aceepted
 4.203:-non-authorative information
3.204:- deleted(no content)
 3.401:- unauthorized
 4.404:- page not found
 5.405:-method not allowed
 6.403:-forbideen
 401 Unauthorized is the status code to return when the client provides no credentials or invalid credentials. 403 Forbidden is the status code to return when a client has valid credentials but not enough privileges to perform an action on a resource	
7.500:- internal server error
6.	400:- bad request
7.402:- payment required
8.501:- not implemented
9.502:- bad gateway
10.503:-service unavailable
11.504:-Gateway timeout
12.505:-network timeout
/////////////////////////
 * cookies are temporary files created by the browser to store data	
	headers we will check response of data type i.e. content-type -application/json
//////////////////create own API's////////////////
 download node.js,npm pakage, json server	
in environment variable under path variable set two path path one of node.js and other of node modules..
cmd -> node --version & npm --version	
cmd-> npm install -g json-server
create students.json file (create file in notepad and save as .json).this file is created to run the API's in json server
cmd-> go to json file location -> json-server students.json(get resources and home i.e.e domain to run API's)
http://localhost:3000/students	
/////////////////////////JSON////////////
 JSON/xml stands for java script object notation
 it is a data format use to send and receive data 
 it is light weighted data
 it is use for encrypton and decription	
it is text written with json
media type is application/json	
filename extension is .json
	
JSON Types:- number, string, boolean, array, objects, null
JSON represent data in key and value pair	
Apply curly brackets in json data	
Always apply "" double quotes in keys
If key has multiple values store in an array	
	
//////////////difference between XML & JSON
 xml: It is less simple as compared to JSON
 	it is less human readable
	does not support array
	it supports many datatypes i.e. graphs, text, charts,number,images
	
JSON: It is simple to read and write
 	files are  human readable
	It support array
	it supports  text & number
	
/////////////////////difference between json object and json array///////////////
JSON object :-it contains multiple key value pairs
 JSON arrays:- it contains multiple vlaues
 ///////////////////////Capture & Validate Json//////////////////////////
Using https://jsonpathfinder.com/
using this website we can capture json data path	eg:-  students[1].location
To check if  the path extracting data from it  or not :- use https://jsonpath.com/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
