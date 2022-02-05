package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement_BY_Name {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement inbox = driver.findElement(By.name("q"));
        inbox.sendKeys("Selenium");

         WebElement searchBottom = driver.findElement(By.name("btnK"));
        //bottom.click();
         searchBottom.submit();  //  when  we want  to  click+get result
         driver.close();






    }
}
