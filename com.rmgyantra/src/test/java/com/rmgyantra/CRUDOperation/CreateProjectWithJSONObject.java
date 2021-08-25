package com.rmgyantra.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJSONObject {
	@Test
	public void createTest() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "new");
		obj.put("projectName", "Comcast1");
		obj.put("status", "completed");
		obj.put("teamSize", 25);

		given()
		.contentType(ContentType.JSON)
		.and()
		.body(obj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		 .assertThat().statusCode(201)
		.log().all();



	}

}
