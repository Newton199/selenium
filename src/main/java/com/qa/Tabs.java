package com.qa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tabs {
     public static void main(String[] args){
         ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        //Getting hadle of Main Window
        String mainWindowHandle =driver.getWindowHandle();
        //  System.out.println(mainWindowHandle);
         //6EC1C94A85EA59AA0257BBD7BBD91ADF
         //6F78BE8E1DAE0418EC425ABAFEBB478F




    WebElement openTabButton =driver.findElement(By.id("opentab"));
    openTabButton.click();

    Set<String> allWindows =driver.getWindowHandles();
    for(String nextWindow : allWindows){
        driver.switchTo().window(nextWindow);
        
    }

    WebElement courselink = driver.findElement(By.linkText("Courses"));
    courselink.click();

    driver.close();

    //Option1 - Switching to the main window using the main window
    driver.switchTo().window(mainWindowHandle);



    //Clicking on  bootstrap drop-Down
    WebElement bootstrapDropDown = driver.findElement(By.xpath("//button[@id='openwindow']"));
    bootstrapDropDown.click();

    //closing  windows we can  used close();

    //driver.quit();











     }
    
}
