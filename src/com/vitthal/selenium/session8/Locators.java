package com.vitthal.selenium.session8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Require;
import org.openqa.selenium.remote.DriverCommand;

public class Locators {

    /*

    How can we find the elements in Selenium???
    we use the findElement() and findElements() method to firnd elements in webpage

    but findElement() method need an argumet of type By

    - Locators ---
    Locators are the static methods which are present in the calss called By
    Locators are used to identify the element which are present on the webpage
    By is an abstract class

    There are 8 type of locator methods and all the locators takes as an argument of type String

    the locators are present in By class are:
    1. id(String id) //id("pickfiles")
    2. name(String name) //name("captcha")
    3. className(String className) // className("button_btn__1dRFj")
    4. tagName(String tag) //
    5. linkText(String linktext) // linkText("Text of your link")
    6. partialLinkText(String partiallink)// partialLinkText("inbox")
    7. cssSelector(String css) //
    8. xpath(String xpath) //




















     */

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver(); // launch the browser

        driver.get("https://www.google.com/"); // it will launch the google page\

        //driver.findElement()




    }


    public void print(String s){

    }

}
