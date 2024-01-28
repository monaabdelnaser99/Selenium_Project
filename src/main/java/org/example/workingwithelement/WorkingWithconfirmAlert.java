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

public class WorkingWithconfirmAlert {
    WebDriver driver;

    @BeforeTest
    public void openUrl() {
        //JavaScript Alert
        driver = new ChromeDriver();
        //driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://cookbook.seleniumacademy.com/Alerts.html");
    }
    @Test(priority = 2)
    public void testConfirmAlert() throws InterruptedException {
        WebElement confirmBtn= driver.findElement(By.id("confirm"));
        confirmBtn.click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        WebElement message=driver.findElement(By.id("demo"));
        Assert.assertEquals("You Accepted Alert!",message.getText());
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void testDismissAlert() throws InterruptedException {
        WebElement dismissBtn= driver.findElement(By.id("confirm"));
        dismissBtn.click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
        WebElement message=driver.findElement(By.id("demo"));
        Assert.assertEquals("You Dismissed Alert!",message.getText());
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}

