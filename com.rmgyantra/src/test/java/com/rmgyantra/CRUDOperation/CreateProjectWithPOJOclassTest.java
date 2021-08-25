package com.rmgyantra.CRUDOperation;

import org.testng.annotations.Test;

import com.remgyantra.POJOClass.POJOclass;
import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithPOJOclassTest {
	@Test
	public void createProject() {
		

			baseURI = "http://localhost";
			port = 8084;
			POJOclass proj = new POJOclass("pojoProject", "Tyss", "Completed", 20);
			
			given()
			.contentType(ContentType.JSON)
			.body(proj)
			.when()
			.post(EndPoint.addProject)
			.then()
			.assertThat().statusCode(201)
			.log().all();
		}
	}

