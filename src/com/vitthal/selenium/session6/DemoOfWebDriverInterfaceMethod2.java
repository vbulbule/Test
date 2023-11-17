package com.vitthal.selenium.session6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfWebDriverInterfaceMethod2 {

    /*
    Write a script for the following
    1. set the size of window
    2. set the position of window
    3. maximize
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        Thread.sleep(4000);
        // window size need to be set

        // to set the size
        Dimension d = new Dimension(300,300);
        driver.manage().window().setSize(d);
        Thread.sleep(4000);

        // to set the position
        Point p = new Point(250,250);
        driver.manage().window().setPosition(p);

        Thread.sleep(4000);

        // how to maximize
        driver.manage().window().maximize();


        // to enter the url
        driver.get("https://www.facebook.com/");


        Thread.sleep(4000);

        // how to close the browser
        driver.close();


    }
}
