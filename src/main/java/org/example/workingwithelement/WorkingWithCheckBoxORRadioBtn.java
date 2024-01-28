package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCheckBoxORRadioBtn {

    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
       // driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");


    }
    @Test(enabled = false)
    public void checkList() throws InterruptedException {

       WebElement check1 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        check1.click();
        Thread.sleep(3000);

        WebElement check2 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        if (check2.isSelected()) {
            check2.click();
        }

    }
    @Test
    public void testElementIsPresent() throws InterruptedException {
        if (isElementPresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]"))){
            WebElement check1 = driver.findElement
                    (By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
            if (!check1.isSelected()){
                check1.click();
            }

        }else {
            Assert.fail("CheckBox 1 doesnot exist");
        }
        Thread.sleep(3000);
    }
    private boolean isElementPresent (By  by) {
        try {
            driver.findElement(by);
               return true;

       } catch (NoSuchElementException e){
            return false;

        }
    }

    @AfterTest
    public void closeDriver(){

        driver.quit();
    }

}
