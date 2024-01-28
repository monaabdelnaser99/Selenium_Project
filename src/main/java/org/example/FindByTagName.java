package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FindByTagName {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/tables");


    }
    @Test
    public void findElementByTagName(){

       //find table first then find all tr found in it
        WebElement table = driver.findElement(By.id("table1"));
        //search of rows in table so we write table. ;
        //find element then use this element to search anything
        List <WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(rows.get(3).getText());
    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
