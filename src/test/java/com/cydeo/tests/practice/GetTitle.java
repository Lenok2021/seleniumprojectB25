package com.cydeo.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://cydeo.com");

        driver.getTitle();

        String pageTitle = driver.getTitle();

        System.out.println("pageTitle = " + pageTitle);

        if(pageTitle.equals("Cydeo")){
            System.out.println("PASSED !");
        }else{
            System.out.println("FAILED !");
        }

        driver.close();







    }



}
