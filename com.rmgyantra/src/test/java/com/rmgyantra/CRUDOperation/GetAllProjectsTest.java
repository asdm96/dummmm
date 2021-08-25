package com.rmgyantra.CRUDOperation;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAllProjectsTest {
	@Test
	public void getAllProjects() {
		//Response response = RestAssured.get("http://localhost:8084/projects");
		//System.out.println(response.asString());
		Response response = when().get("http://localhost:8084/projects");
		System.out.println(response.prettyPrint());
		
	}

}
