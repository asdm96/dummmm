package com.rmgyantra.CRUDOperation;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.rmgyantra.GenericUtils.IConstants;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateprojectUsingJson2 {
	@Test
	public void createProjectwithJSONFileTest()
	{
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Sandhya");
		obj.put("projectName", "SDET13");
		obj.put("status", "Completed");
		obj.put("teamSize", 20);

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
