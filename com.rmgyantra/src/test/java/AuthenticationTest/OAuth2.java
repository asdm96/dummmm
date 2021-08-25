package AuthenticationTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth2 {
	@Test
	public void oAuth() {
		Response response = given()
				//form paramter is used bcz it is sent in header not in body
			.formParam("client_id", "Application-1")//avalable when u create an app
			.formParam("client_secret", "13023c3c73d543bde0ad686d3894215a")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "https://example.com")
			
			.when()
				.post("http://coop.apps.symfonycasts.com/token");
		
		     String token=response.jsonPath().get("access_token");
		
		given()
			.contentType(ContentType.JSON)
			.auth().oauth2(token)
			.pathParam("id", "1951")
			.when()
			.post("http://coop.apps.symfonycasts.com/api/{id}/chickens-feed")
			.then().log().all();
		
		
	}

}
