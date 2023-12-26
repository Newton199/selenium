package com.qa.id;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Addition_select_class { 

    public static void main(String[] args) {
        
         ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);

        WebElement dropDown =driver.findElement(By.xpath("(//select)[1]"));
       //Creating object  of select class   and passing ' dropdown  as an argument to Select() constructor'
        Select select = new Select(dropDown);

        //retreving first selected option

        // WebElement firstSelectedOption = select.getFirstSelectedOption();
        // System.out.println(firstSelectedOption.getText());

        //Checking if Drop-Down  Support Mutiple Selectors
        // boolean isMultiSelect =select.isMultiple();
        //  System.out.println(isMultiSelect);

        //Retreving All Available Options In a  Drop down

        List <WebElement> allOptions =select.getOptions();
        for (WebElement option : allOptions){
            System.out.println(option.getText());
        }





    }
}