package Pcom.rmgyantra.parameter;

import org.testng.annotations.Test;

import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter2 {
	@Test
	public void forms() {
		given()
		.contentType(ContentType.JSON)
		//.formParam("createdBy", "Adarsh")
		.formParam("projectName", "DELL")
		.formParam("status", "On-Going")
		.formParam("teamSize", 25)
		.when()
		.post("http://localhost:8084"+EndPoint.addProject)
		.then()
		.log().all();
		
	}
  
}
