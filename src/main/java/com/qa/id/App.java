package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // firefoxdriver using for chrome just say chrome driver and for edge just say
        // Edgedriver but
        // you have to input the chrome driver to
        /*we can used driver.navigate().to("URL");
         for  navigating the website 
         */
       /* * WebDriver driver = new FirefoxDriver();
        driver.get("https://chroma.mexil.it/site/login");*/
           
           /*Locating using id() locator/method
           WebElement userNameTextBox =driver.findElement(By.id(id:"form-username"));
           userNameTextBox.sendKeys(...keyToSend:"general@teacher.com");*/
	ChromeOptions options=new ChromeOptions();
		
		//Set the path of brave browser
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
	//	WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
                driver.navigate().back();
    }
}
