package com.epam.eventportal.automation.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API {

    private static RequestSpecification requestSpec;

//    public void soe(){
////        RestAssured.config() = RestAssured.config().getSSLConfig().with().keyStore("/truststore_javanet.jks", "test1234");
//
//        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig()
//                .trustStore(this.getClass().getResource("src/test/resources/truststore_javanet.jks").getFile(), "test1234").trustStoreType("JKS");
//    }


    @BeforeClass
    public static void createRequestSpecification() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://autorqa.events.epam.com/api/v2").
                setAccept(ContentType.JSON).
                setKeyStore("src/test/resources/truststore_javanet.jks", "test1234").
                build();
    }

    @Test
    public void checkBasicEventDetails() {

        given().trustStore("/cacerts.jks", "test1234").spec(requestSpec).
                when().
                get("/events").
                then().
                assertThat().
                statusCode(200);
    }
}
