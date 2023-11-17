package com.vitthal.selenium.session6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfWebDriverInterfaceMethod3 {

    /*
    What are the difference between get() method and navigate() method

    - using get() method we can just enter the URL

    - using navigate() method you can
      - enter the url
      - navigate to the previus page
      - navigate to next/forward page
      - refresh page

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        Thread.sleep(4000);

        // how to maximize
        driver.manage().window().maximize();

        // to enter the url
        driver.get("https://www.facebook.com/");

        Thread.sleep(4000);


        // demo for navigate() method

        // enter the url using navigate
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(4000);

        // to move back
        driver.navigate().back();
        Thread.sleep(4000);

        // to forward
        driver.navigate().forward();
        Thread.sleep(4000);

        // to refresh
        driver.navigate().refresh();
        Thread.sleep(4000);


        // how to close the browser
        driver.close();


    }
}
