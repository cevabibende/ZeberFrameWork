package org.example.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.utilities.ConfigurationReader;
import org.example.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Hooks {
    public static final Logger logger = LoggerFactory.getLogger(Hooks.class);


    @Before
    public void setUp(Scenario scenario) {
        logger.info(":::Start test automation :::");
        logger.info("BrowserType :: {}", ConfigurationReader.getProperty("browser"));
        logger.info("Environment :: {}", ConfigurationReader.getProperty("url"));
        logger.info("Test scenario :: {}", scenario.getName());
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
            logger.error("Test scenario :: {} :: Failed", scenario.getName());
        } else {
            logger.info("Test scenario :: {} :: Passed", scenario.getName());
        }
        Driver.closeDriver();
    }
}
