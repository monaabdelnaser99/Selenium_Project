package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

         driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findElementByID(){

        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt =  driver.findElement(By.id("password"));
        System.out.println(usernameTxt.getLocation());
        System.out.println(passwordTxt.getTagName());
    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
