package com.vitthal.selenium.session6;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfWebDriverInterfaceMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        // to enter the url
        driver.get("https://www.facebook.com/");

        // to get the title of webpage
        String webpageTitle=driver.getTitle();
        System.out.println("Webpage TItle is :"+webpageTitle);

        //to get the current url of webpage
        System.out.println("Current URL : "+driver.getCurrentUrl());

        //how to get source code of your webpage
        System.out.println("Source code of webpage is : "+ driver.getPageSource());


        Thread.sleep(4000);

        // how to close the browser
        driver.close();


    }
}
