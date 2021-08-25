package Pcom.rmgyantra.parameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Gitpathparameter {
	@Test
	public void pathpara() {
		given()
			.contentType(ContentType.JSON)
			.pathParam("username","adarshmgit")
			.when()
			.get("https://api.github.com/users/{username}/repos")
			.then().log().all();
	}

}
