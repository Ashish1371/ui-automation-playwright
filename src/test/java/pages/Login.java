package pages;

import com.microsoft.playwright.Locator;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import stepDefinitions.BaseTest;


public class Login extends BaseTest {

    Locator userName = page.locator("//input[@id='user-name']");
    Locator password = page.locator("//input[@id='password']");
    Locator loginButton = page.locator("//input[@id='login-button']");
    Locator error = page.locator("//*[@data-test='error']");

    public void enterCredentials(String usernameValue, String passwordValue) {
        Assert.assertEquals(page.title(), "Swag Labs");
        userName.fill(usernameValue);
        password.fill(passwordValue);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public static void verifyTitle() {

    }

    public void close() {
        page.close();
    }

    public void verifyError() {
        error.isVisible();
    }
}
