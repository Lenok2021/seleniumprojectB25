package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {

    public static void main(String[] args) throws InterruptedException {

     /*
     TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google

      */

        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com ");
        WebElement gMailBotton = driver.findElement(By.className("gb_d"));
        gMailBotton.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("PASSED !!!");
        }else{
            System.out.println("FAILED !!!");
        }
        Thread.sleep(3000);

        driver.navigate().back();

        String expectedTitle1 = "Google";
        String actualTitle1 =  driver.getTitle();
        if(actualTitle1.equals(expectedTitle1)){
            System.out.println("PASSED !!!");
        }else{
            System.out.println("FAILED !!!");
        }
  driver.close();

    }


}
