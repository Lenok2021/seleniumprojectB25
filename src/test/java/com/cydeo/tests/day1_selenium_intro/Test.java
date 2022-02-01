package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

       // 1. setting up the WebDriverManager
        // we create our "Browser Driver"
       WebDriverManager.chromedriver().setup();


        // 2. Create instance of the Chrome.
        //  this line will open the Browser for us.

        WebDriver driver = new ChromeDriver();


        // 3. Test the driver is working
        driver.get("https://www.facebook.com");




    }
}
