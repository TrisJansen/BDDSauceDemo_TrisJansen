package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {

    public static WebDriver driver;

    public BuyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement selectButton1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement selectButton2;

    @FindBy(xpath = "//a[.='2']")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipPostalCode;

    @FindBy(css = "#continue")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='cart_item_label']")
    private WebElement cartItem;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public void clickAdd1(){
        selectButton1.click();
    }
    public void clickAdd2(){
        selectButton2.click();
    }

    public void cart(){
        cartButton.click();
    }

    public void remove(){
        removeButton.click();
    }
    public void checkOut(){
        checkoutButton.click();
    }
    public void setFirstName(String frName) {
        firstName.sendKeys(frName);
    }
    public void setLastName(String lsName) {
        lastName.sendKeys(lsName);
    }
    public void setPostalCode(String zipCode) {
        zipPostalCode.sendKeys(zipCode);
    }
    public void continueClick() {
        continueButton.click();
    }
    public boolean verifyCartItem(){
        return cartItem.isDisplayed();
    }

    public void finishButtonClick() {
        finishButton.click();
    }





}
