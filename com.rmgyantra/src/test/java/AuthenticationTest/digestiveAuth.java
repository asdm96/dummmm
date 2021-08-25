package AuthenticationTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class digestiveAuth {
	@Test
	public void digestive() {
		 given()
	       	.contentType(ContentType.JSON)
	       	.auth().preemptive().basic("rmgyantra", "rmgy@9999")
	       	.when()
	       	.get("http://localhost:8084/login")
	       	.then().log().all();
		
	}

}
