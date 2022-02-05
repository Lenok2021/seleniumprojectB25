package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement_By_ID {

    public static void main(String[] args) {

        //1. assume  we want to identify search box  at Yahoo.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  navigate to web site
        driver.get("https://yahoo.com");
        // get webElement
        WebElement inboxBox = driver.findElement(By.id("ybar-sbq"));
       // enter text Hello

        inboxBox.sendKeys("Hello");

        // 2. assume  we want to identify search bottom  at Yahoo.com

        WebElement searchBottom = driver.findElement(By.id("ybar-search"));
        searchBottom.click();

        driver.close();








    }
}

