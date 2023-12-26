package com.qa.id;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radioButton {
      public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
         //we can write xpath in diffrent ways //*[@id="radio-btn-example"]/fieldset/label[1] this  is  also an example

       /* driver.findElement(By.xpath("//input[@value='radio1']")).click();
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        driver.findElement(By.xpath("//input[@value='radio3']")).click();*/

         //For specidfic selecdtion ofradio button we know  Handling the specific radio
         driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
         driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();


         /*Relative radio button as a List of web element and click  */
         



}
}