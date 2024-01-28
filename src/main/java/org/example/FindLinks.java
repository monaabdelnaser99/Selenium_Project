package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinks {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    @Test
    public void findLinlTextBYLINK(){

        WebElement seleniumLink = driver.findElement(By.linkText("Elemental Selenium"));
        System.out.println(seleniumLink.getAttribute("href"));

    }
    @Test
    public void findPartialLinlTextBYLINK(){

        WebElement seleniumLink1 = driver.findElement(By.partialLinkText("Elemental "));
        System.out.println(seleniumLink1.getAttribute("href"));

    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }


}
