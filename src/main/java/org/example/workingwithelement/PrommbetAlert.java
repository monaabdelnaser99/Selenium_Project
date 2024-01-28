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

public class PrommbetAlert {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){
        //JavaScript Alert
        driver =new ChromeDriver();
        //driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");


    }
    @Test
    public void testPromptAlert() throws InterruptedException {
        //click simple button to show an alert box
        WebElement promptAlert= driver.findElement(By.id("prompt"));
        promptAlert.click();
Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Mona");
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        WebElement message =driver.findElement(By.id("prompt_demo"));
        Assert.assertEquals("Hello Mona! How are you today?",message.getText());


    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
