package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitleVerification {

    public static void main(String[] args) {


        // WE  DO testing we HAVE  to do it step by step

        //TC #1: Yahoo Title Verification
        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // make our page full screen
        driver.manage().window().maximize();


        //REMEMBER  WHEN YOU WROTE TWO LINES CODES RUN IT CHECK YOURSELF

        //2.Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");


        //3. Verify title:
        //Expected: Yahoo






    }
}
