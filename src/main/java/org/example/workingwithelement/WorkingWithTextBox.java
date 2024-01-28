package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBox {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void loginScreen() throws InterruptedException {

        WebElement txtUsername = driver.findElement(By.id("username"));
        WebElement txtPassword =  driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.className("radius"));
        txtUsername.clear();
        txtUsername.sendKeys("tomsmith");
        txtPassword.clear();
        txtPassword.sendKeys("SuperSecretPassword!");
        loginBtn.click();
        Thread.sleep(3000);
        //certain that move to second page and login success
        WebElement successNotfication = driver.findElement(By.id("flash"));
        //certain that success element contain the specific message
        System.out.println(successNotfication.getText());
        //assert true (boolean expression)
        Assert.assertTrue(successNotfication.getText().
                contains("You logged into a secure area!"));

    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


