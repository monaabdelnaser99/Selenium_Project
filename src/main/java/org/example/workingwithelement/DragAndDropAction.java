package org.example.workingwithelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropAction {
    WebDriver driver;
    @BeforeTest
    public void openUrl(){

        driver =new ChromeDriver();
        //driver.navigate().to("https://www.google.com");

        driver.navigate().to("https://cookbook.seleniumacademy.com/DragDropDemo.html");


    }
    @Test
    public void testDragAndDrop() throws InterruptedException {
        WebElement source =driver.findElement(By.id("draggable"));
        WebElement target =driver.findElement(By.id("droppable"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(source,target).perform();
        Thread.sleep(3000);
        Assert.assertEquals("Dropped!", target.getText());

    }


    @AfterTest
    public void closeDriver(){

        driver.quit();
    }
}
