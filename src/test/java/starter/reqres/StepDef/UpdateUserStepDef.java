package starter.reqres.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

import java.io.File;

public class UpdateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Put update user with valid json with id {int}")
    public void putUpdateUserWithValidJson(int id) {
        File json = new File(ReqresAPI.JSON_REQUEST + "/RequestUser.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @Given("Put update user with invalid json with id {int}")
    public void putUpdateUserWithInvalidJsonWithId(int id) {
        File json = new File(ReqresAPI.JSON_REQUEST + "/InvalidRequestUser.json");
        reqresAPI.putUpdateUser(id, json);
    }
    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(ReqresAPI.PUT_UPDATE_USER);
    }
}
