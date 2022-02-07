package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {
    public static void main(String[] args) {
     /*
        1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
      */

      //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://google.com
        driver.get("https://google.com");

       // 3 Find inputBox
        // PRESS KEYS
        WebElement inputBox = driver.findElement(By.name("q"));
        inputBox.sendKeys("Apple" + Keys.ENTER);


       // 4- Verify title:
      //  Expected: Title should start with “apple” word
          String expectedTitle = "Apple";
          String actualTitle = driver.getTitle();
          if(actualTitle.startsWith(expectedTitle)){
              System.out.println("PASSED");
          }else{
              System.out.println("FAILED");
          }

          driver.close();

    }
}
