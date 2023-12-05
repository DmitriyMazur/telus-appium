package com.telus.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

// TestBase class for common setup and teardown logic
/**
 * This class serves as the base class for all test classes in the Telus TV mobile test suite.
 * It provides common setup and teardown methods for initializing the driver and quitting it after the tests.
 */
public class TestBase {

    protected AppiumDriver<MobileElement> driver;
    protected TelusTvPage telusTvPage;
    protected String telusUrl;

    /**
     * Set up method to initialize the test environment.
     * 
     * @throws MalformedURLException if the URL is malformed.
     */
    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Config.getProperty("platformName"));
        capabilities.setCapability("deviceName", Config.getProperty("deviceName"));
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "17.0");
    
        String platformName = Config.getProperty("platformName");
    
        if (platformName.equalsIgnoreCase("iOS")) {
            capabilities.setCapability("browserName", "safari");
            driver = new IOSDriver<>(new URL(Config.getProperty("appiumServerUrl")), capabilities);
        } else if (platformName.equalsIgnoreCase("Android")) {
            // Initialize Android driver if needed
        }
    
        telusUrl = Config.getProperty("telus.Url");
    
        telusTvPage = new TelusTvPage(driver);
    }

    /**
     * This method is used to tear down the test environment after each test class.
     * It checks if the driver instance is not null and quits the driver.
     */
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
