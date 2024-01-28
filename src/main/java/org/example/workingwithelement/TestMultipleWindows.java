package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMultipleWindows {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
      //  driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://cookbook.seleniumacademy.com/Config.html");
    }
    @Test
    public void testWindowUsingTitle (){
        //store window of parent
        String currentWindowID = driver.getWindowHandle();
        driver.findElement(By.id("visitbutton")).click();
        for (String windowID : driver.getWindowHandles()){
           String title = driver.switchTo().window(windowID).getTitle();
           if (title.equals("Visit Us")){
               Assert.assertEquals("Visit Us",driver.getTitle());
               ///write any code to elements in visit us page
               System.out.println(driver.getTitle());
               driver.close();
               break;
           }
        }
        driver.switchTo().window(currentWindowID);
    }
    @Test
    public void testWindowUsingName (){
        String currentWindowID = driver.getWindowHandle();
        driver.findElement(By.id("visitbutton")).click();
        driver.switchTo().window("VisitUsWindow");
        Assert.assertEquals("HelpWindow",driver.getTitle());

    }
    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
