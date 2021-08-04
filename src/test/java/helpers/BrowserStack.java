package helpers;

import static io.restassured.RestAssured.given;

public class BrowserStack {
    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic("zyumalin_pAn1Hs", "TcckcRQGVQNyf9JXpNiq")
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .statusCode(200)
                .log().body()
                .extract()
                .response()
                .path("automation_session.video_url");

    }
}