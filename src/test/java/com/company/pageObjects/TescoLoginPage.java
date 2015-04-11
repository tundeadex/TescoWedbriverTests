package com.company.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Babatunde on 03/04/2015.
 */
public class TescoLoginPage {


    WebDriver myDriver;

//    public TescoLoginPage(WebDriver driver){
//        myDriver = driver;
//    }

    public TescoLoginPage(WebDriver driver){
        myDriver = driver;
    }

    public void fillLoginForm(String username, String password){
        myDriver.findElement(By.cssSelector("input#loginID.ip")).clear();
        myDriver.findElement(By.cssSelector("input#loginID.ip")).sendKeys(username);
        myDriver.findElement(By.cssSelector("input#password.ip")).clear();
        myDriver.findElement(By.cssSelector("input#password.ip")).sendKeys(password);
        myDriver.findElement(By.name("confirm-signin")).click();
    }
}
