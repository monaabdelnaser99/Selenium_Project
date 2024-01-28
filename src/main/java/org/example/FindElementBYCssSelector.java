package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementBYCssSelector {
    //combinatin of between two things (value of class attribute and type of element)
    // "." for class and "#" for type
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findBycssSelector(){
        WebElement headerlbl =driver.findElement(By.cssSelector("h2"));
        WebElement login = driver.findElement(By.cssSelector("button.radius"));
        WebElement password = driver.findElement(By.cssSelector("input#password"));
        System.out.println(login.getText());
        System.out.println(password.getTagName());
        System.out.println(headerlbl.getText());
    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}



