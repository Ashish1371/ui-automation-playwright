package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.AriaRole;
import org.testng.Assert;

import static stepDefinitions.BaseTest.page;


public class HomePage {

    Locator backPack = page.locator("//*[@id='add-to-cart-sauce-labs-backpack']");
    Locator cart = page.locator("//*[@id='shopping_cart_container']");
    Locator checkOut = page.locator("//*[@id='checkout']");

    public void addToCart() {
        backPack.click();
    }

    public void verifyTitle() {
    }

    public void openCart() {
        cart.click();
    }

    public void checkOut() {
        checkOut.click();
    }
}
