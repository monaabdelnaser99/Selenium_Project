package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class FindElements {
    //find many things that share same anything like className or cssSelector
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/");


    }
    @Test
    public void findElements(){
  //list beacause elements.
        //get all the links displayed on page
        List <WebElement> link = driver.findElements(By.tagName("a"));
        //verify there are 46 links displayed on the page
        Assert.assertEquals(46,link.size());
        //print each link value
        for(WebElement li : link){
            System.out.println(li.getAttribute("href"));
        }
        System.out.println(link.size());
    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}


