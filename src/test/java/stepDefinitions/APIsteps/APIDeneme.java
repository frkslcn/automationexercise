package stepDefinitions.APIsteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

public class APIDeneme {

    Response response;
    Response response2;

//    @Test
//    public void get() {
//        String endpoint = "https://automationexercise.com/api/productsList";
//        //String endpoint = "https://automationexercise.com/api/brandsList";
//        //String endpoint = "https://automationexercise.com/api/getUserDetailByEmail";
//
//        //Set the expected data
//        //3. send the request and Get the response
//        Response response = given().when().get(endpoint);
//        response.prettyPrint();
//        //4. do the validation and assertion
//
//        response.then().statusCode(200);







        @Test
        public void getMethod02(){
            Response response = given().
                    when().
                    get("https://automationexercise.com/api/productsList");

            response.prettyPrint();
            System.out.println(response.statusCode());  // Status codu yazdirmak icin

            // Statusline i consola yazdirmak icin
            System.out.println(response.statusLine());
            //Response body deki datanin content() type nedir  (xml , json, )
            System.out.println( "Content type 1.yol  :"+response.getContentType());
//            response2.then().assertThat().statusCode(200).contentType(ContentType.JSON).
//               body("products.id", hasItem(43));


        }
}
