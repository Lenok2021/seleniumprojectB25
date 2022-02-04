package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL_PageSourceCode {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
               
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        
        //  how  to  get  the entire page source code
        String pageSourceCode = driver.getPageSource();
        System.out.println("pageSourceCode = " + pageSourceCode);

        driver.close();


         




    }
}
