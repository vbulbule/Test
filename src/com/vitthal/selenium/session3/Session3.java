package com.vitthal.selenium.session3;

public class Session3 {
    /*

    - Java Selenium Hierarchy

    1. SearchContext is the supermost interface which contains two methods
        - findElement()
        - findElements()
       SearchContext is inherited by another interface which is called as WebDriver

    2. WebDriver interface contains 13 different types of method including findElement() and findElements() method

    3. There are other two types on interfaces which is
       1. JavaScriptExecutor
       2. TakeScreenshot

    All the interfaces are implemented class called RemoteWebDriver, and it is a Super-most
    class in java selenium architecture

    all the methods of RemoteWebDriver class are override in respective browser classes such as FireFoxDriver, ChromeDriver
    IEDriver

    The FireFoxDriver class  is used to work with gicodriver.exe
    The ChromeDriver class  is used to work with chromedriver.exe
    IEDriver class is used to work with IEDriver.exe

    WebDriver Interface Contains 13 Different methods
    1. get()
    2. getTitle()
    3. getCurrentUrl()
    4. getPageSource();
    5. findElement();
    6. findElements();
    7. getWindowHandle();
    8. getWindowHandles();
    9. switchTo();
    10. navigate();
    11. manage();
    12. close();
    13. quite();

    Methods of JavaScriptExecutor
     1. executeScript()

    Methods of TakeScreenSHot
     1. getScreenshotAs()

    Tools required for selenium
    1. Java (installed)
    2. IDE (eclipse, intellij) (installed)
    3. Browsers (Chrome, firefox, IE) (installed)
    4. Selenium file (selenium - java library) (no need to download)
    5. Driver executable files to communicate with real browsers (no need to download)

    -Steps to install Selenium

    Step 1 : Download selenium jar files and driver executable file from the following url
    - https://www.selenium.dev/downloads/

    Step 2 : extract all the driver executable files

    Step 3 : in eclipse create new java project and Name it as per your conveninencec
       for example : SeleniumAutomationLearning

    Step 4 : under the SeleniumAutomationLearning project create 2 folders
            1. drivers (in our case we renamed as driver)
            2. jars (in our case we renamed as selenium-java)
    Step 5 : store all the extracted driver executable under drivers folder

    Step 6 : store all the jar files in jars folder

    Step 7 : Associate the selenium jar files with the current java project
         - how to associate the selenium jars
           - to associate the jar file
             1. Right-Click on your project SeleniumAutomationLearning
             2. CLick on build path and new popup window will open
             3. click in the classpath section
             4. click on Add Jars (as we have stored all the jars in the current project)
             5. select all the jars in the jars folder and click on apply

   Note: All the jar files should be associated with java project
   -How to confirm that all the jar files are associated?
   - when you associate all the jars will add to your current project, new library will be added as
     ReferenceLibraries and when you expand you will be able to see all the associated jars

   Note: we should not Associated driver executable files

   Folder Structure after you associate with all the jars

   |SeleniumAutomationLearning
   |-> JRE System Library[Java SE 17]
   |
   |-> src
   |   |->com.selenium.demo
   |      |->Demo.java
   |->ReferenceLibraries
   |
   |->Drivers
   |   |->chromedriver.exe
   |   |->gecodriver.exe
   |   |->IEDriverServer.exe
   |
   |->jars
   |   |-> all the selenium jars


   - Working with Chrome Browser

   -in order to work with chrome browser we use chromedriver.exe file

   -before launching the browser we have to specify the path of driver executable file

   -We can spefify a path of the driver executable file by using setProperty(String , String) method of System class

   - setProperty() method it will take 2 argument
      1. path of your driver executable in string format
      2. key (key will be different for every browser) its in string format

   -key for chrome driver is : webdriver.chrome.driver

   -path of your chromedriver.exe
      for ex : C:\Users\vitbulbu\IdeaProjects\Test\drivers\chromedriver.exe


   if we did not do the above settings it will throw the  IlligalStateException


   How does Selenium Perform action
   - by calling native methods of browsers

   -> the automation code which we write in java language like driver.close();
   -> driver.close() will call the methods of your driver executable file i.e chromedriver.exe
   -> in chromedriver.exe there are already pre defined methods are present which will call the native methods of
     your actual browser

     this is how selenium performs the action on real webbrowser

     Key for firefox : webdriver.gecko.driver
     key for IE : webdriver.ie.driver




































     */
}
