package com.rmgyantra.CRUDOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;


import com.rmgyantra.GenericUtils.EndPoint;
import com.rmgyantra.GenericUtils.IConstants;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFileTest {
	@Test
	public void createProjectwithJSONFileTest()
	{
		
		baseURI = "http://localhost";
		port = 8084;
		File file = new File(IConstants.JSONPATH);
		
		given()
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post(EndPoint.addProject)
		.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}
}
