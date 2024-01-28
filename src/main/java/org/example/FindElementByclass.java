package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByclass {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findElementByClass(){
        //not find id and name
        WebElement buttonLogin =driver.findElement(By.className("radius"));
        WebElement usernameTxt = driver.findElement(By.id("username"));
        WebElement passwordTxt =  driver.findElement(By.id("password"));
        System.out.println(usernameTxt.getTagName());
        System.out.println(passwordTxt.getTagName());
        System.out.println(buttonLogin.getText());

    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


