package com.qa.id;
import java.util.List;
//import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Booststrap_dropDown {
    
    /**
     * @param args
     */
    public static void  main(String[] args){

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

    //Attempting To use Select class
    //  WebElement dropDown = driver.findElement(By.xpath("(//select)[1]"));

    //  Select select =new Select(dropDown);
    //  select.selectByVisibleText("Option1");

     //Intializing ' bootstrapDropDown' with webelement locator

    // WebElement bootstrapDropDown = driver.findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));

    // bootstrapDropDown.click();

    //Beginier  way
    // WebElement option1 = driver.findElement(By.xpath("(//label[@class='dropdown-item'])[1]"));
    // option1.click();

    //chroma tech way Bootstrap  frameqork 

    List<WebElement> dropDownOptions = driver.findElements(By.xpath("/html/body/fieldset/div/div/label"));
    

    for (WebElement Option : dropDownOptions){

        if (Option.getText().equals("Option 3")) {
            Option.click();
            break;

            
        }
    }






    }
}
