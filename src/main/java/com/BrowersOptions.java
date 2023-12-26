package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowersOptions {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);

    }
}
