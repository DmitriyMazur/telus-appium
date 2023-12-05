package com.telus.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelusTvPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;

    public TelusTvPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public boolean isTitleNotEmpty() {
        wait.until(driver -> !driver.getTitle().isEmpty());
        return true;
    }

    public void assertTitleEquals(String expectedTitle, String errorMessage) {
        wait.until(driver -> driver.getTitle().equals(expectedTitle));
        String actualTitle = driver.getTitle();
        assertCondition(actualTitle.equals(expectedTitle), errorMessage);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    private void assertCondition(boolean condition, String errorMessage) {
        if (!condition) {
            throw new AssertionError(errorMessage);
        }
    }
}
