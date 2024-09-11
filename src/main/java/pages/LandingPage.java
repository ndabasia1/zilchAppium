package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

/**
 * This page contains methods and locators relating to the Landing Page
 */
public class LandingPage
{
    private AppiumDriver driver;
    
    /* **************** 
     *  CONSTRUCTOR 
     ****************** */

    /**
     * Constructor that initializes the driver
     * <p>
     * @param driver The driver to control interactions
     */
    public LandingPage(AppiumDriver driver)
    {
        this.driver = driver;
    }

    /* **************** 
     *  PUBLIC METHODS 
     ****************** */

    /**
     * Get the create account button
     * <p>
     * @return the create account button element
     */
    public WebElement createAccountButton()
    {
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"Create account\"]"));
    }

    /**
     * Get the login button
     * <p>
     * @return the login button element
     */
    public WebElement loginButton()
    {
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"Log in\"]"));
    }
}