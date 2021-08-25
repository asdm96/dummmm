package com.rmgyantra.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	@Test
	public void createProject() {
		JSONObject object=new JSONObject();
		object.put("createdBy", "Adarsh");
		object.put("projectName", "Comcast");
		object.put("status", "completed");
		object.put("teamSize", 100);

		RequestSpecification res=RestAssured.given();
		res.body(object);
		Response response=res.post("http://localhost:8084/addprojects");
		System.out.println(response.getStatusCode());

	}

}
