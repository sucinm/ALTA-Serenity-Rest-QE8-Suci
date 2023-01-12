package starter.reqres.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

import java.io.File;

public class LoginStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Login user with valid json")
    public void loginUserWithValidJson() {
        File json = new File(ReqresAPI.JSON_REQUEST+"/RequestLogin.json");
        reqresAPI.loginUser(json);
    }

    @When("Send request login user")
    public void sendRequestLoginUser() {
        SerenityRest.when().post(ReqresAPI.LOGIN);
    }

    @Given("Login user with invalid json")
    public void loginUserWithInvalidJson() {
        File json = new File(ReqresAPI.JSON_REQUEST + "/InvalidRequestLogin.json");
        reqresAPI.loginUser(json);
    }
}
