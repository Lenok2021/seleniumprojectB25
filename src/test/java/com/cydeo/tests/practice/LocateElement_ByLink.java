package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement_ByLink {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(3000);

        //1.  identify Link About
        WebElement linkElement = driver.findElement(By.linkText("About"));
        linkElement.click();
        Thread.sleep(3000);

        //2. identify Link Products
        WebElement linkElement2 = driver.findElement(By.linkText("Products"));
        linkElement2.click();



        driver.close();









    }


}
