package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    public WebDriver webDriver;

    public CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User sort product list by {string}")
    public void selectProductSort(String sort){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.selectProductFilter(sort);
    }

}
