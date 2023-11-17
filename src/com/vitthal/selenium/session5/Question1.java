package com.vitthal.selenium.session5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Question1 {

    /*
    Write a script to open and close the browsers (Chrome, Firefox, IE) based on
    User Input
    if user input : Chrome then chrome browser should open
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which browser do you want to open? Type Chrome/Firefox/IE : ");
        String browser= sc.next();
        System.out.println("You are opening "+browser+" browser.");

        WebDriver driver = null;

        if(browser.equals("Chrome")){
            // write the code for launching the Chrome browser
            System.setProperty("webdriver.chrome.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.close();

        } else if (browser.equals("Firefox")) {
            // write the code for launching firefox browser
            System.setProperty("webdriver.gecko.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            Thread.sleep(3000);
            driver.close();

        } else if (browser.equals("IE")) {
            // write the code for launching IE browser
            System.setProperty("webdriver.ie.driver","C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            Thread.sleep(3000);
            driver.close();
        }
        else {
            System.out.println("You have entered the invalid Input please check");
        }

        /*
        THe above code is an example fpr runtime polymorphism

        to run the same script on multiple brosers we are converting subclass object into webdriver interface type

        for ex : WebDriver driver = new ChromeDriver
                           driver = new FirefoxDriver

        Q. Have you acieve runtime polymorhism in your automation framework?
          - yes

        Q what is the diffference between below two stateemnts?

        1. WebDriver driver = new ChromeDriver()
        2. ChromeDriver driver = new ChromeDriver()

        Using Web driver driver type we can create the multiple browser like Chrome, IE , Firefox using single driver variable
        in second statement driver type is only associated to ChromeDriver so this driver variable we cannot use for
        to launch the other browsers such as firefox etc

        It is recommended to use the WebDriver driver = new ChromeDriver()  in your framework so in future we can
        run our scripts in multiple browsers


         */


    }
}
