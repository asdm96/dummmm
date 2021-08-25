package com.ramgYantra.ComplexResponse;

import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateComplexDynamicResponse {
	@Test
	public void createDynamicResponse() {
		String expectedData="Adarsh";
		//get all the projects
		Response response = when().get("http://localhost:8084/projects");
		
		//store the jsonpath in list
		List<String> list = response.jsonPath().get("createdBy");
		
		//validate the expected data in json path
		for(String actualData:list) {
			if(expectedData.equalsIgnoreCase(actualData)) {
				System.out.println(actualData+"Is present in the response");
				break;
			}
		}
	     response.then().log().all();
		
	}

}
