package com.rmgyantra.CRUDOperation;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;

public class CreateProjectUsingHashmapTest {
	@Test
	public void createProjectWithHashmap() {
		HashMap hash = new HashMap();
		hash.put("createdBy", "rahul");
		hash.put("projectName", "wipro");
		hash.put("status", "Completed");
		hash.put("teamSize", 25);
		
		given()
		.contentType(ContentType.JSON)
		.body(hash)
		.when()
		.post("http://localhost:8084"+EndPoint.addProject)
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
