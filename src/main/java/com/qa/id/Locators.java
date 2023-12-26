package com.qa.id;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) {
        // WebDriver driver = new FirefoxDriver();
        // Using brave browers
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);
        // Locatiing username by id/method locator
        WebElement usernameTextBox = driver.findElement(By.id("form-username"));

        usernameTextBox.sendKeys("general@teacher.com");

        // Locating password using name value/method locator
        //WebElement passwordTextbox = driver.findElement(By.name("password"));
        //passwordTextbox.sendKeys("123456");

        // Locating by using classname() /method  for that use css selector line number 51

        // WebElement passwordTextbox = driver.findElement(By.className("form-password
        // form-control"));
        // passwordTextbox.sendKeys("123456");

        // Using locating tag name()
        // driver.findElement(By.tagName("input")).sendKeys("123456");

        // Locating using link textmethods/locators 

        //driver.findElement(By.linkText("Forgot Password?")).click();

        //Locating using partiallinktext() locator/methods
       // driver.findElement(By.partialLinkText("Forgot Passwor")).click();

       //locating using cssselector #and id name inspect it and do and method #attribute value 

      // driver.findElement(By.cssSelector("#form-password")).sendKeys("123456");

      //locating css selectors using [class='form-password form-control'] method /locators

      //driver.findElement(By.cssSelector("[class='form-password form-control']")).sendKeys("123456");

      /*abosolute  xpath start  like this  from single slash:-
       /html/body/div/div/div/div/div/div/div/div[2]/form/div[2]/input
       locating using full/abosoulte xpath expression method  */


      //driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

      /*Relative x-path start like this //*[@id='form-password'] locating using relative xpath methods
       
      note :-  instead of using ""  used ''  there in id */
      driver.findElement(By.xpath("//*[@id='form-password']")).sendKeys("123456");

      /*  /html/body/div/div/div/div/div/div/div/div[2]/form/button for signup */
      driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/form/button")).click();




    }
}
