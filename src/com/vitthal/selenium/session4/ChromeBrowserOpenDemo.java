package com.vitthal.selenium.session4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserOpenDemo {

    public static void main(String[] args) throws InterruptedException {

        String key = "webdriver.chrome.driver";
        String path = "C:\\Users\\vitbulbu\\IdeaProjects\\Test\\drivers\\chromedriver.exe";
        System.setProperty(key,path);

        ChromeDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.close();

        System.out.println("Hey... you successfully created your first selenium program");
    }
}
