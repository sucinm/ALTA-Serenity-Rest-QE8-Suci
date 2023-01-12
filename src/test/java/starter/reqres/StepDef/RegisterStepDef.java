package starter.reqres.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

import java.io.File;

public class RegisterStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Register user with valid json")
    public void registerUserWithValidJson() {
        File json = new File(ReqresAPI.JSON_REQUEST + "/RequestRegister.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request register user")
    public void sendRequestRegisterUser() {
        SerenityRest.when().post(ReqresAPI.REGISTER);
    }

    @Given("Register user with invalid json")
    public void registerUserWithInvalidJson() {
        File json = new File(ReqresAPI.JSON_REQUEST + "/InvalidRequestRegister.json");
        reqresAPI.registerUser(json);
    }
}
