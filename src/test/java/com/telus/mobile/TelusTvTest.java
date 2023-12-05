package com.telus.mobile;

import org.testng.Assert;
import org.testng.annotations.*;


public class TelusTvTest extends TestBase {

    /**
     * Test case to navigate to the TELUS URL and assert the title.
     */
    @Test
    public void navigateToTelusUrlAndAssertTitle() {
        // Open Safari and navigate to TELUS URL
        telusTvPage.navigateToUrl(telusUrl);

        // Assert that the title is not empty
        Assert.assertTrue(telusTvPage.isTitleNotEmpty(), "Title is empty");

        // Assert that the title matches the expected value
        telusTvPage.assertTitleEquals(Config.getProperty("telus.expectedTitle"), "Title mismatch");
    }

    /**
     * Test case to navigate to the TELUS URL and assert the correctness of the URL.
     */
    @Test
    public void navigateToTelusUrlAndAssert() {
        // Open Safari and navigate to TELUS URL
        telusTvPage.navigateToUrl(telusUrl);

        // Assert that the correct URL is displayed
        String currentUrl = telusTvPage.getCurrentUrl();
        Assert.assertEquals(currentUrl, telusUrl, "URL mismatch");

        // Optionally, add further assertions or interactions as needed
    }
}

