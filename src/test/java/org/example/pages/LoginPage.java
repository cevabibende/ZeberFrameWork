package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[name='email']")
    WebElement logInEmailBoxElement;

    @FindBy(css = "#password")
    WebElement loginPasswordBoxElement;

    @FindBy(css="input[value$='Sign In']")
    WebElement signInButton;

    public void enterEmailValue(String email ){
        logInEmailBoxElement.sendKeys(email);
    }

    public void enterPasswordValue(String password){
        loginPasswordBoxElement.sendKeys(password);
    }
    public void clickSignInButton(){
        signInButton.click();
    }


}
