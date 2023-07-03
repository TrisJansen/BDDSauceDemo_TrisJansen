package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.BuyPage;
import org.example.pageObject.CartPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BuySteps {

    public WebDriver webDriver;

    public BuySteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User pick the product Test.allTheThings TShirt Red")
    public void selectProduct1(){
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.clickAdd1();
    }
    @And("User pick the product Sauce Labs Onesie")
    public void selectProduct2() {
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.clickAdd2();
    }
    @Then("User click cart logo")
    public void clickCartButton(){
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.cart();
    }
    @And("User remove Test.allTheThing TShirt Red")
    public void clickRemove(){
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.remove();
    }
    @Then("User want to checkout the product")
    public void clickCheckout(){
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.checkOut();
    }
    @When("User input {string} as firstName and input {string} as lastName and input {string} as postalCode")
    public void inputCredential(String firstName,String lastName, String postalCode) {
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.setFirstName(firstName);
        buyPage.setLastName(lastName);
        buyPage.setPostalCode(postalCode);
        buyPage.continueClick();
    }
    @Given("User already on checkoutOverview page")
    public void verifyCheckoutOverview() {
        BuyPage buyPage = new BuyPage(webDriver);
        Assert.assertTrue(buyPage.verifyCartItem());
    }
    @And("User have finish purchase the product")
    public void finishCheckout(){
        BuyPage buyPage = new BuyPage(webDriver);
        buyPage.finishButtonClick();
    }
}