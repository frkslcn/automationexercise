package stepDefinitions.APIsteps;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APIDeneme {

    Response response;

    @Test
    public void get() {
        String endpoint = "https://automationexercise.com/api/productsList";
        //This is primitive way that we do not prefer!
        //Set the expected data
        //3. send the request and Get the response
        Response response = given().when().get(endpoint);
        response.prettyPrint();
        //4. do the validation and assertion

        System.out.println("response.then().statusCode(200) = " + response.then().statusCode(200));




    }
}
