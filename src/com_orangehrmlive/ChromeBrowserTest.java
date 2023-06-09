package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest
{
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args)
    {
        driver = new ChromeDriver(); // launch the browser
        driver.get(baseUrl); // opean the url in the Chrome browser
        System.out.println("Page Title : " + driver.getTitle()); // Print the page title
        System.out.println("Current Url : " + driver.getCurrentUrl()); // Print the current Url
        System.out.println("Page Source : " + driver.getPageSource()); // Print the page source
        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter the username into username field
        driver.findElement(By.name("password")).sendKeys("admin123"); // Enter the Password into Password field
        driver.close(); //closing the chrome

    }

}
