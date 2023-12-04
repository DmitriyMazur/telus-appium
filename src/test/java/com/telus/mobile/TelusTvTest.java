package com.telus.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class TelusTvTest {

    private AppiumDriver<MobileElement> driver;

    @BeforeClass
    @Parameters({"platformName", "deviceName", "appiumServerUrl"})
    public void setUp(String platformName, String deviceName, String appiumServerUrl) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "17.0");

        if (platformName.equalsIgnoreCase("iOS")) {
            driver = new IOSDriver<>(new URL(appiumServerUrl), capabilities);
        } else if (platformName.equalsIgnoreCase("Android")) {
            // Initialize Android driver if needed
        }
    }

    @Test
    public void navigateToTelusUrlAndAssert() {
        // Open Safari and navigate to TELUS URL
        driver.get("https://telustvplus.com/#/");

        // Assert that the correct URL is displayed
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://telustvplus.com/#/";
        Assert.assertEquals(currentUrl, expectedUrl, "URL mismatch");

        // Optionally, add further assertions or interactions as needed
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
