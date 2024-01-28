package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithDropDownList {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/");


    }
    @Test
    public void testDropDown(){

        WebElement seleniumLink = driver.findElement(By.linkText("Dropdown"));
        seleniumLink.click();
        Select option = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));

        Assert.assertFalse(option.isMultiple());

        Assert.assertEquals(3,option.getOptions().size());

        option.selectByVisibleText("Option 1");

    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}


