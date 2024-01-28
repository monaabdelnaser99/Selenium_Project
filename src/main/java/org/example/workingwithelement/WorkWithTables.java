package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class WorkWithTables {

    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
       // driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://the-internet.herokuapp.com/tables");


    }

    @Test
    public void testWebTable () throws InterruptedException {
        WebElement webTable = driver.findElement(By.id("table1"));
         //get all rows
        List<WebElement> rows = webTable.findElements(By.tagName("tr"));
        Assert.assertEquals(5, rows.size());

        //get all cells data

        for (WebElement row : rows ){
            List<WebElement> col = row.findElements(By.tagName("td"));
            for (WebElement cols : col){
                // "\t" add space between rows
                System.out.println(cols.getText() + "\t");
                Thread.sleep(3000);
            }
        }
    }

    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
