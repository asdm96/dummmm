package com.ramgYantra.ComplexResponse;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateComplexStaticResponseTest {
	@Test
	public void validateStaticResponse() {
		String expectedData="";
		
		//get all the projects
		Response response=when().get("http://localhost:8084/projects");
		
		//store the static response using jsonpath
		response.jsonPath().get("[0].projectName");
		
		response.then().log().all();
		
		
	}

}
