package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithSubmitMethod {
    WebDriver driver;
    WebElement txtSearch;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

       // driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void submit() throws InterruptedException {

         txtSearch = driver.findElement(By.id("APjFqb"));
        txtSearch.clear();
        txtSearch.sendKeys("Selenium web driver");
        txtSearch.submit();
        Thread.sleep(3000);
         txtSearch =driver.findElement(By.id("APjFqb"));
        txtSearch.clear();
        txtSearch.sendKeys("frontend");
        txtSearch.submit();
        Thread.sleep(3000);


    }
    @AfterTest
    public void closeDriver(){

        //driver.quit();
    }
}


