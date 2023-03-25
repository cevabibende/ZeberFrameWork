package org.example.step_definitions;

import org.example.utilities.BrowserUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test extends BaseStep {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://InarAcademy:160621@5.161.191.25");

        driver.findElement(By.xpath("//div[@class='d-inline-block welcome-content dropdown-toggle']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("dene@hotmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        BrowserUtils.wait(1);
        driver.findElement(By.cssSelector("input[value$='Sign In']")).click();

        String firstNameText = driver.findElement(By.xpath("//td[normalize-space()='First Name']")).getText();
        Assert.assertEquals(firstNameText,"First Name");



    }




}
