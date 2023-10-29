package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class base {
    public WebDriver initializeBrowser(String browserName){
        WebDriver driver;
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
        return driver;


    }
}
