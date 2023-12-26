package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);
        //xpath of text 

      WebElement signinbuttontext = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
     System.out.println("The Text of signin button: " + signinbuttontext.getText());
     // forgot pass relative xpass

     WebElement forgotpassword =driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
     System.out.println("The Forgot password Text is " + forgotpassword.getText());

    }
}
