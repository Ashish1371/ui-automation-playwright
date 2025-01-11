package stepDefinitions;

import com.microsoft.playwright.*;
import helpers.PropertyReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.TestNGCucumberRunner;
import pages.HomePage;
import pages.Login;
import runner.TestRunner;

import java.util.Arrays;

public class Common {

    private Login login = new Login();
    private HomePage home = new HomePage();


    @Given("user is able to launch login page")
    public void user_is_able_to_lauch_login_page() throws Exception {

    }

    @When("title of login page is {string}")
    public void title_of_login_page_is(String string) {
        login.verifyTitle();

    }

    @Then("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        login.enterCredentials(username, password);

    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        login.clickLogin();
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {

        home.verifyTitle();
    }

    @Then("Close the browser")
    public void close_the_browser() {
        login.close();
    }

    @Then("user gets login error")
    public void user_gets_login_error() {
        login.verifyError();
    }

}
