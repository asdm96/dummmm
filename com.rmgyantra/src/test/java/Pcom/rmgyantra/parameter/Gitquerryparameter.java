package Pcom.rmgyantra.parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Gitquerryparameter {
	@Test
	public void gitquerry() {
		given()
			.queryParam("q", "auth_repo_verification")
			.when()
			.get("https://api.github.com/search/repositories")
			//in background--https://api.github.com/search/repositories?q=auth_repo_verification
			.then().log().all();
		
	}

}
