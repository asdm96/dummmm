package Pcom.rmgyantra.parameter;

import org.testng.annotations.Test;

import com.rmgyantra.GenericUtils.EndPoint;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
	@Test
	public void formParameter() {
		given()
		.contentType(ContentType.JSON)
		.formParam("createdBy" , "dhoni12")
		.formParam("projectName","oop1s")
		.formParam("status","completed")
		.formParam("teamSize", 20)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		//.assertThat().statusCode(201);
		
	}
	

}
