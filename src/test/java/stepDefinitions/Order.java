package stepDefinitions;

import com.microsoft.playwright.Locator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Checkout;
import pages.HomePage;
import pages.Login;

import java.util.List;
import java.util.Map;

public class Order {

    private Login login = new Login();
    private HomePage home = new HomePage();
    private Checkout checkout = new Checkout();

    @When("user add product to cart")
    public void user_add_product_to_cart() {
        home.addToCart();
    }

    @Then("product should be added to cart")
    public void product_should_be_added_to_cart() {
        home.openCart();
        home.checkOut();
    }

    @When("User complete order")
    public void user_complete_order(DataTable userData) {
        List<Map<String, String>> data = userData.asMaps(String.class, String.class);
        checkout.submitCheckoutForm(data.get(0).get("firstname"), data.get(0).get("lastname"), data.get(0).get("postcode"));
    }

    @Then("Order is successful")
    public void order_is_successful(DataTable msg) {
        List<Map<String, String>> data = msg.asMaps(String.class, String.class);
        checkout.validateOrderComplete(data.get(0).get("ExpectedMessage"));

    }


}
