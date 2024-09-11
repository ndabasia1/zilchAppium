package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.LandingPage;

/**
 * Tests relating to the Landing page
 */
public class LandingPageTests
{
    private AppiumDriver driver;
    private LandingPage landingPage;

    /**
     * Set-up the driver and page objects
     */
    @Before
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("My_Android_Device");
        options.setUdid("");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setAppPackage("com.payzilch.app");
        options.setAppActivity("com.payzilch.app.MainActivity");
        options.setNoReset(true);
        options.setAutomationName("UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        
        landingPage = new LandingPage(driver);
    }

    /**
     * Test the Create Account and Login button is present on the landing page
     */
    @Test
    public void testCreateAccountAndLoginButtonPresent()
    {
        Assert.assertTrue(landingPage.createAccountButton().isDisplayed());
        Assert.assertTrue(landingPage.loginButton().isDisplayed());
    }

    /**
     * Close the driver
     */
    @After
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}