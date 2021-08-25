package AuthenticationTest;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerToken {
	@Test
	public void barerToken() {
		HashMap map = new HashMap();
		map.put("name", "mohan");
		
		given()
		.auth()
		.oauth2("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")
		.body(map)
		.when()
		.post("https://api.github.com/user/repos")
		.then()
		.log().all();
		
	}

}
