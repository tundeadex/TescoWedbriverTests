package com.company.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babatunde on 03/04/2015.
 */
public class TescoGroceryPage {

    WebDriver myDriver;

    public TescoGroceryPage(WebDriver driver){
        myDriver = driver;
    }


    public boolean amILoggedIn(){
        return myDriver.findElement(By.cssSelector("a.myaccountlink")).isDisplayed();
    }
}
