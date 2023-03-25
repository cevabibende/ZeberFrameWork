package org.example.pages;

import org.example.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='d-inline-block welcome-content dropdown-toggle']")
    private WebElement welcomeGuestButton;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement searchBox;


    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//button[@id='header-search-icon']")
    private WebElement searchIcon;

    @FindBy(xpath = "(//h2[normalize-space()='Whoops!'])[1]")
    private WebElement whoopsErrorMessage;

    @FindBy(xpath = "(//span[@class='col-12'])[1]")
    private WebElement noResultFoundErrorMessage;

    @FindBy(css = ".mb-5")
    private WebElement aboutUsPageContentText;

    public void clickWelcomeGuestButton() {
        welcomeGuestButton.click();
    }

    public void enterProductNameToSearchBox(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickSearchBox() {
        searchBox.click();
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public String getWhoopsErrorMessageText() {
        return whoopsErrorMessage.getText();

    }

    public String getNoResultFoundText() {
        return noResultFoundErrorMessage.getText();
    }

    public String getAboutUsPageContentText(){
        return aboutUsPageContentText.getText();
    }




}
