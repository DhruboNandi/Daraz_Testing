package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class testing {
    WebDriver driver;
    //prottek test case er age execute hobe
    @BeforeMethod
    public void setup(){
        String browserName ="edge";
        if(browserName.equals("chrome")){
            driver=new EdgeDriver();}
            else if(browserName.equals("firefox")){
                driver=new FirefoxDriver();
            }
        
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.daraz.com.bd/");
        driver.findElement(By.xpath("//a[text()='Login']")).click();

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
    @Test(priority = 1)
    public void VerifyLogin(){

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01873279362");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("dhruba1256");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
       //driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("shirt");
//       //driver.findElement(By.xpath("//*[@id=\"topActionHeader\"]/div/div[2]/div/div[2]/form/div/div[2]/button")).click();
//       //Assert.assertTrue(driver.findElement(By.cssSelector("input[placeholder=\"Search in Daraz\"]")).isDisplayed());
//       // driver.findElement(By.cssSelector("input[placeholder=\"Search in Daraz\"]")).sendKeys("shirt");
//        //driver.findElement(By.cssSelector("input[placeholder=\"Search in Daraz\"]")).sendKeys("shirt");
    }
    @Test(priority = 2)
    public void VerifyInvalidLogin(){

        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("0873279362");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("dhruba1256");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
        //driver.findElement(By.cssSelector("input[placeholder=\"Search in Daraz\"]")).sendKeys("shirt");
        //Assert.assertTrue(driver.findElement(By.cssSelector(".loggedin-link")).isDisplayed());
       // Assert.assertTrue(driver.findElement(By.linkText("account-item-anchor")).isDisplayed());




    }

}
