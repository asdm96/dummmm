package com.ramgYantra.ComplexResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.remgyantra.POJOClass.POJOclass;
import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;

public class CreateMultipleProjectUsingDataProvider {
	@Test (dataProvider = "provideData")
	public void createProject(String createdBy, String projectName, int teamSize) {
		
			baseURI = "http://localhost";
			port = 8084;
			POJOclass pojo = new POJOclass(createdBy, projectName, "On-Going", teamSize);
			//Project proj = new Project(createdBy, projectName, "On-Going", teamSize);
			
			given()
			.contentType(ContentType.JSON)
			.body(pojo)
			.when()
			.post(EndPoint.addProject)
			.then()
			.assertThat().statusCode(201)
			.log().all();
			
		}
		
		@DataProvider
		public Object[][] provideData()
		{
			Object[][] objArray = new Object[5][3];
			
			objArray[0][0] = "adarsh";
			objArray[0][1] = "tyss";
			objArray[0][2] = 35;
			
			objArray[1][0] = "mohan";
			objArray[1][1] = "Dell";
			objArray[1][2] = 62;
			
			objArray[2][0] = "santhosh";
			objArray[2][1] = "ust";
			objArray[2][2] = 45;
			
			objArray[3][0] = "prakash";
			objArray[3][1] = "wipro";
			objArray[3][2] = 22;
			
			objArray[4][0] = "deeskhith";
			objArray[4][1] = "iron";
			objArray[4][2] = 39;
			
			return objArray;
		}
	}


