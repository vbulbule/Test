package com.vitthal.selenium.session6;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOfWebDriverInterfaceMethod4 {

    /*
    What is the difference between close() and quit()

    - close() method will close only current browser or parent browser

    - quite() method will close all the browsers which are opened by selenium

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();



        Thread.sleep(4000);

        // how to maximize
        driver.manage().window().maximize();

        // to enter the url
        driver.get("https://www.naukri.com/");

        Thread.sleep(8000);


        // how to close the current browser
        driver.close();

        //using quite() it will close all the opned browser by selenium for particular driver instance
        driver.quit();


    }
}
