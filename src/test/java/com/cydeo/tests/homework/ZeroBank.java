package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) throws InterruptedException {

        /*
        TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html ");

          Thread.sleep(3000);

        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedResult = "Log in to ZeroBank";
        String actualResult = headerText.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("PASSED !!!");
        }else{
            System.out.println("FAILED !!!");
        }

  driver.quit();



    }
}
