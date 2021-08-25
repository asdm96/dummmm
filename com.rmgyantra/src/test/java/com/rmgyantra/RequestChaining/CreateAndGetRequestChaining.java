package com.rmgyantra.RequestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateAndGetRequestChaining {
	@Test
	public void createAndGet() {
		JSONObject object=new JSONObject();
		object.put("createdBy", "Adarsh new1");
		object.put("projectName", "chaining");
		object.put("status", "completed");
		object.put("teamSize", 21);

		given()
		.contentType(ContentType.JSON)
		.and()
		.body(object)
		.when()
		.post("http://localhost:8084/addProject");
		
		Response response = when().get("http://localhost:8084"+EndPoint.getProject);
		String id=response.jsonPath().get("[6].projectId");
	    
		given()
		.pathParam("projectId", id)
		.when().get("http://localhost:8084/projects/{projectId}")
		.then()
		.log().all();
		
	}

}
