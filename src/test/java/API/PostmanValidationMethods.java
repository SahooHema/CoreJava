package API;

public class PostmanValidationMethods {

	public static void main(String[] args) {
		
		/*
Postman:- In java we use junit and TestNG framework to organize test cases
	& In postman we use chai assertion library.. 
	
We use javascript under it, use pm lib functions for validating  json response data 
either use arrow function => () , normal function().. 	
	
	Validations:- statuscode, responsetime,headers,cookies,responsebody values, arrays,responsetype,jsonschema
If one validation fails under test function, then whole test will fails
	
	JSON SCHEMA:- it has define datatype for each fields i.e. int for empid, string for empname etc.. that datatype only we can store in table..
	Based on schema, data store in json file..
	The datatype specified in schema that only need to store in json file..
	Why validate json schema? 
	coz to check json response is following the json schema or not 
////////////////////////////////////////// scripts///////////////////////	
	pre-request script:- we will use this script before sending the request
	when create post request , at that time need to send dynamic data in pre-script
	when send parameter i.e. url, ip address to request
	test script:- we will use this script after we get response.
	we can define pre-script & test script at collection,folder and request level..
	///////////////variables///////////
	 variable is use when data is repetive .i.e. url 
	types: global,local,environment,collection,data.
	local var is created in pre-script i.e. 
	
	pm.variables.set("url_local","https://reqres.in/api");
   pm.globals.set("userid","2");
   pm.collectionVariables.set("userid_collect","1");
   pm.environment.set("userid_env","3");
	
Note:with the help of pre-script can create collection,global,env,local variables..	

After use of variables, need to delete it, then create delete script in tests..	
pm.globals.unset("userid");
pm.collectionVariables.unset("userid_collect");
pm.environment.unset("userid_env");
	
Print the varaibles in postman:-
console.log(pm.globals.get("userid"));
 console.log(pm.collectionVariables.get("userid_collect"));
 console.log(pm.environment.get("userid_env"));	
	////////////////////////////////API'S Chaining////////////
	 var jsonData=JSON.parse(responseBody);
pm.environment.set("id",jsonData.id);
Note:- need to use this script in test tab
	 
	token:- 73ec7c98506a86b2318a143c97d92c5cd69dac3adb74c3c95b8dba345daeaaf5
Always set token in collection authorization tab .it will automatically use by the requests..
In authorization, select inherit auth ..	
//////////////random generate emilid////////////
 var random= Math.random().toString(36).substring(2);
var email="sana"+random+"@gmail.com";
var name="sana"+random;
pm.environment.set("email_env",email);
pm.environment.set("username_env",name);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 */
	}

}
