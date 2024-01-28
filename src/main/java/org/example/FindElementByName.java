package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByName {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findElementByName(){
        try {


    //not find id.
        WebElement usernameTxt = driver.findElement(By.name("usernamel77"));
        WebElement passwordTxt =  driver.findElement(By.name("password"));
        System.out.println(usernameTxt.getTagName());
        System.out.println(passwordTxt.getTagName());
        } catch (NoSuchElementException e){
            System.out.println("The");
        }
    }

    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


