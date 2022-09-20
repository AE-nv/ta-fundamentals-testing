package be.ae.technicalqafundamentals;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class TechnicalQaFundamentalsApplicationTests {

    @LocalServerPort
    private int localServerPort;

    @BeforeEach
    void setup() {
        RestAssured.port = localServerPort;
    }

    @Test
    void contextLoads() {
    }
}
