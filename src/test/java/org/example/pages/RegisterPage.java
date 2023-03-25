package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    @FindBy(css = "input[name='first_name']")
    private WebElement firstNameBox;

    @FindBy(css = "input[name='last_name']")
    private WebElement lastNameBox;

    @FindBy(css = "input[name='email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordBox;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    private  WebElement confirmPasswordBox;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;


    public void enterFirstName(String firstName){
        firstNameBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        lastNameBox.sendKeys(lastName);
    }

    public void enterEmailBox(String email){
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword){
        confirmPasswordBox.sendKeys(confirmPassword);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

}
