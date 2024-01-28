package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByXpath {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/login");


    }
    //@Test
   // public void findElementByID(){
        //normal Xpath
       /* WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        System.out.println(userName.getTagName());
        System.out.println(LoginBtn.getText());*/

   // }
    @Test
        public void findElementByRelativeXpath(){
        //dynamic xpath
        WebElement userName = driver.findElement(By.xpath("//input"));
        //input[3] try.s
        WebElement LoginBtn = driver.findElement(By.xpath("//button"));
        System.out.println(userName.getTagName());
        System.out.println(LoginBtn.getText());
    }


    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


