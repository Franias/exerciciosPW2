/**
 * Copyright 2022 RPMHub @ https://github.com/rpmhub/pw2-rest-client
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.rpmhub;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(ServiceBMock.class)
public class ProjectTest {

    @Test
    @Order(2)
    public void testServiceB() {
        given()
        .port(8080)
        .when().get("/serviceb/person/Rodrigo")
        .then()
           .statusCode(200)
           .body(is("{\"name\":\"Rodrigo\"}"));
    }

    @Test
    @Order(2)
    public void testServiceA() {
        given()
        .when().get("/servicea/person/Rodrigo")
        .then()
           .statusCode(200)
           .body(is("{\"name\":\"Rodrigo\"}"));
    }

}
