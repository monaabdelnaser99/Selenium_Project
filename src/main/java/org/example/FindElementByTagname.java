package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByTagname {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findElementByTagName(){
        //locate element using their tag name ,this similar to javaScript (Dom method in JavaScript.
       WebElement LoginBtn = driver.findElement(By.tagName("button"));
       LoginBtn.click();
    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


