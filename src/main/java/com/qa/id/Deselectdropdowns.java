package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Deselectdropdowns {
    public static void main(String[] args){
     ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);

        //Intializing 'dropdown ' with WebElement
        WebElement dropDown= driver.findElement(By.xpath("(//select)[1]"));
         Select select =new Select(dropDown);

         select.deselectAll();

         //Selecting value  by visible text
         select.selectByVisibleText("Three");
         //Deselecting Value By visible Text
         //select.deselectByVisibleText("One");
    }
}
