package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//td[normalize-space()='First Name']")
    private WebElement firstNameText;

    @FindBy(xpath = "//td[normalize-space()='Last Name']")
    private WebElement lastNameText;

    @FindBy(xpath = "//td[normalize-space()='Gender']")
    private WebElement genderText;

    @FindBy(xpath = "//td[normalize-space()='Date Of Birth']")
    private WebElement dateOfBirthText;

    @FindBy(xpath = "//td[normalize-space()='Email']")
    private WebElement emailText;

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    private WebElement aboutUsLink;


    public String getFirstNameText() {
        return firstNameText.getText();
    }

    public String getLastNameText() {
        return lastNameText.getText();
    }

    public String getGenderText() {
        return genderText.getText();
    }

    public String getDateOfBirthText() {
        return dateOfBirthText.getText();
    }

    public String getEmailText() {
        return emailText.getText();
    }

    public void clickAboutUsLink() {
        aboutUsLink.click();
    }
}
