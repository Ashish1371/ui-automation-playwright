package pages;

import com.microsoft.playwright.Locator;
import org.testng.Assert;

import static stepDefinitions.BaseTest.page;

public class Checkout {

    Locator firstName = page.locator("//*[@id='first-name']");
    Locator lastName = page.locator("//*[@id='last-name']");
    Locator postalCode = page.locator("//*[@id='postal-code']");
    Locator continueButton = page.locator("//*[@id='continue']");
    Locator cancelButton = page.locator("//*[@id='cancel']");

    Locator finish = page.locator("//*[@id='finish']");

    Locator orderSuccessConfirmation = page.locator("//*[@id='checkout_complete_container']//h2");

    public void submitCheckoutForm(String firstNameValue, String lastNameValue, String postcode) {
        firstName.fill(firstNameValue);
        lastName.fill(lastNameValue);
        postalCode.fill(postcode);
        continueButton.click();
        finish.click();
    }
    public void validateOrderComplete(String expected) {
        Assert.assertEquals(orderSuccessConfirmation.textContent(), expected);

    }
}
