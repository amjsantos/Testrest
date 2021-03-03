package br.com.api.teste;
import static io.restassured.RestAssured.*;

import org.junit.Test;

public class TesteQaAntonio {
	
	@Test
	public void deliveryInvalidData() {
		given()
		.when().get("http://challengeqa.staging.devmuch.io/en/10")
		.then()
			.log().all();
	}

	@Test
	public void delivery1() {
		given()
		.when().get("http://challengeqa.staging.devmuch.io/-10000")
		.then()
			.log().all();
	}
	
	@Test
	public void delivery1000() {	
		given()
		.when().get("http://challengeqa.staging.devmuch.io/1000")
		.then()
			.log().all();
	}
}
