package org.example.workingwithelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertJavaScript {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){
        //JavaScript Alert
        driver =new ChromeDriver();
        //driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");


    }
    @Test
    public void testSimpleAlert(){
        //click simple button to show an alert box
        WebElement btnAlert= driver.findElement(By.id("simple"));
        btnAlert.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals("Hello! I am an alert box!",alertText);
        alert.accept();

    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
