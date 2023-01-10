package starter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ReqresAPI {
    public static String BASE_URL = "https://reqres.in";

    public static String GET_LIST_USER = BASE_URL + "/api/users?page={page}";

    @Step("Get list user in page {0}")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page)
                .get(GET_LIST_USER);
    }

}
