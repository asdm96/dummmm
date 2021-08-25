package AuthenticationTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class preemptiveAuth {
    @Test
    public void preeptiveAuths() {
       given()
       	.contentType(ContentType.JSON)
       	.auth().digest("rmgyantra", "rmgy@9999")
       	.when()
       	.get("http://localhost:8084/login")
       	.then().log().all();
    	
    }

}
