package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxes {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        /* Check boxes using xpath */
        // driver.findElement(By.xpath("//input[@value='option1']")).click();
        //  driver.findElement(By.xpath("//input[@value='option2']")).click();
        //   driver.findElement(By.xpath("//input[@value='option3']")).click(); 

        //handlimg the check box

        // driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();
        // driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).click();
        // driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option1']")).click();
    }

 }