package com.company.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babatunde on 03/04/2015.
 */
public class TescoHomePage {

    WebDriver myDriver;

    public TescoHomePage(WebDriver driver){
        myDriver = driver;
    }

    public void openTescoHomePage(){
        myDriver.get("http://www.tesco.com/");
    }

    public void goToLoginPage(){
        myDriver.findElement(By.cssSelector("a.loginPageLink")).click();
        myDriver.findElement(By.cssSelector("a#grocery-sign-in")).click();
    }

    public boolean amIOnTheHomePage(){
       return myDriver.getCurrentUrl().equals("http://www.tesco.com/");
    }
}
