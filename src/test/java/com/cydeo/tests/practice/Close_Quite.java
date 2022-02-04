package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quite {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(3000);
        // driver.close();  //  close current page

        driver.get("https://amazon.com");
        Thread.sleep(3000);

        driver.quit();  //  close  all  Webpages opened by driver


    }
}
