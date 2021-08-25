package com.rmgyantra.CRUDOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class DeleteAProjectWithBDDTest {
	@Test
	public void deleteProject() {
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_001")
		.then()
		.assertThat().statusCode(204)
		.log().all();

	}

}
