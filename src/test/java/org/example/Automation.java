package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

   static WebDriver driver;

    public static void main(String[] args) {
       // C:\Users\kruna\Downloads\chromedriver_win32 (1)

        System.setProperty("webdriver.chrome.driver","C:\\Users\\kruna\\Downloads\\Browser_Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

    }
}
