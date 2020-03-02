package sin.java.testdata.harrypotter.service;

import groovy.util.logging.Slf4j;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CharacterServiceTest {

    @LocalServerPort
    private int port;

    final static String ROOT_URL = "http://localhost:1717/api/all";

    @Test
    void getAllCharacters() {
       given().port(port)
               .get(ROOT_URL)
               .then()
               .log()
               .all();
    }
}