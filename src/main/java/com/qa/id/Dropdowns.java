package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns{

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // intializing the dropdown witWeb element
        WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
         Select select =new Select(dropdown);

         //Selecting option  by visible Text
         //select.selectByVisibleText("Option1");

         //selecting option by index
        //select.selectByIndex(2);

         //selecting option by value
        select.selectByValue("option3");

    }
}