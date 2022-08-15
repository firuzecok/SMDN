package stepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import pages.Room1;
import pages.Room1Post;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication2.generateToken;

public class RoomSteps {

    Response response;
Room1Post room1Post =new Room1Post();
Room1 roomPut=new Room1();

    Room1[] rooms ;

    @Given("kullanici roomlar icin get request yapar")
    public void kullanici_roomlar_icin_get_request_yapar() {

        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("room_endpoint"));
        response.then().assertThat().statusCode(200);
//       response.prettyPrint();
    }
    @Given("kullanici gelen room datayi deserialize eder")
    public void kullanici_gelen_room_datayi_deserialize_eder() throws Exception{
        ObjectMapper obj = new ObjectMapper();
        rooms = obj.readValue(response.asString(), Room1[].class);
        System.out.println("kac tane room obejesi var? " +rooms.length);
        for(int i=0; i < rooms.length; i++){
            System.out.println(rooms[i].getDescription());
            System.out.println(rooms[i].getRoomNumber());
        }
    }
    @Then("kullanici room datasini validate eder")
    public void kullanici_room_datasini_validate_eder() {
    }

    @Given("kullanici roomlar icin post request yapar")
    public void kullanici_roomlar_icin_post_request_yapar() {

        // Set the expected data
        room1Post.setRoomType("TWIN");
        room1Post.setPrice(500);
        room1Post.setRoomNumber(10253010);
        room1Post.setStatus(true);
        room1Post.setDescription("Team57 Room");

        //response = postRequest(ConfigReader.getProperty("room_post"),room1Post );

        response=given().headers(
                "Authorization",
                "Bearer"+generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).
                body(room1Post).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("room_post"));

    }
    @Then("kullanıcı post request validation yapar")
    public void kullanıcı_post_request_validation_yapar() throws IOException {

        // 1. validation

        response.then().assertThat().statusCode(201);
        response.then().assertThat().body("price",equalTo(500)).
                body("roomNumber",equalTo(10253010)).
                body("roomType",equalTo("TWIN"));

        // 2. validation
        JsonPath json=response.jsonPath();
        assertEquals(room1Post.getRoomType(),json.getString("roomType"));
        assertEquals(Optional.ofNullable(room1Post.getRoomNumber()),json.getInt("roomNumber"));
        assertEquals(room1Post.getPrice(),json.getString("price"));


        // 3. validation
        Map<String,Object> actualMapData=response.as(HashMap.class);
        assertEquals(room1Post.getPrice(),actualMapData.get("price"));
        assertEquals(room1Post.getRoomType(),actualMapData.get("roomType"));
        assertEquals(room1Post.getRoomNumber(),actualMapData.get("roomNumber"));

        // 4. validation
        Room1 roomActualData=response.as(Room1.class);
        assertEquals(room1Post.getRoomNumber(),roomActualData.getRoomNumber());
        assertEquals(room1Post.getRoomType(),roomActualData.getRoomType());
        assertEquals(room1Post.getPrice(),roomActualData.getPrice());

        // 5.validation
        ObjectMapper obj=new ObjectMapper();

        Room1 room2ActualData=obj.readValue(response.asString(),Room1.class);

        assertEquals(room1Post.getPrice(),room2ActualData.getPrice());
        assertEquals(room1Post.getDescription(),room2ActualData.getDescription());
        assertEquals(room1Post.getRoomNumber(),room2ActualData.getRoomNumber());

        // 6. validation
        Gson gson=new Gson();
        Room1 room3ActualData=gson.fromJson(response.asString(),Room1.class);
        assertEquals(room1Post.getPrice(),room3ActualData.getPrice());
        assertEquals(room1Post.getDescription(),room3ActualData.getDescription());
        assertEquals(room1Post.getRoomNumber(),room3ActualData.getRoomNumber());



    }


    @Given("kullanici roomlar icin put request yapar")
    public void kullaniciRoomlarIcinPutRequestYapar() {


        roomPut.setId(123456789);
        roomPut.setRoomType("DELUXE");
        roomPut.setRoomNumber(123);
       // roomPut.setDescription();
        roomPut.setId(123456789);


    //   response = given().headers(
    //           "Authorization",
    //           "Bearer " + generateToken(),
    //           "Content-Type",
    //           ContentType.JSON,
    //           "Accept",
    //           ContentType.JSON).body().contentType(ContentType.JSON).when().put(ConfigReader.getProperty("room_endpoint"));


    }

    @Then("kullanıcı put request validation yapar")
    public void kullanıcıPutRequestValidationYapar() {

    }
}
