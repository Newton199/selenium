package com.qa.id;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleGetUrl {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);
        //getting  title of page 
        String actualtitle =driver.getTitle();

        System.out.println(actualtitle);
        //geting current url  of that pages 

         String actualUrl =driver.getCurrentUrl();
         System.out.println("Actual Url is:" + actualUrl);
         


    }
}
