package com.rmgyantra.CRUDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOneProjectTest {
 @Test
 public void getSingleProject() {
	 Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_001");
	 System.out.println(response.prettyPrint());
	 
 }
}
