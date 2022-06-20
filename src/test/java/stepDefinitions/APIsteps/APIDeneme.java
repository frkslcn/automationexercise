package stepDefinitions.APIsteps;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APIDeneme {

    Response response;

    @Test
    public void get() {
        //String endpoint = "https://automationexercise.com/api/productsList";
        //String endpoint = "https://automationexercise.com/api/brandsList";
        String endpoint = "https://automationexercise.com/api/getUserDetailByEmail";

        //Set the expected data
        //3. send the request and Get the response
        Response response = given().when().get(endpoint);
        response.prettyPrint();
        //4. do the validation and assertion

        response.then().statusCode(200);




    }
}
