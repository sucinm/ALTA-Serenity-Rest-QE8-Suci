package starter.reqres.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.Utils.Constant;

import java.io.File;

public class LoginStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Login user with valid json")
    public void loginUserWithValidJson() {
        File json = new File(Constant.JSON_REQUEST + "/RequestLogin.json");
        reqresAPI.loginUser(json);
    }

    @When("Send request login user")
    public void sendRequestLoginUser() {
        SerenityRest.when().post(ReqresAPI.LOGIN);
    }

    @And("Validate json schema success login user")
    public void validateJsonSchemaLoginUser() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "/LoginSuccessfulSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Login user with invalid json")
    public void loginUserWithInvalidJson() {
        File json = new File(Constant.JSON_REQUEST + "/InvalidRequestLogin.json");
        reqresAPI.loginUser(json);
    }

    @And("Validate json schema failed login user")
    public void validateJsonSchemaFailedLoginUser() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "/LoginUnsuccessfulSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
