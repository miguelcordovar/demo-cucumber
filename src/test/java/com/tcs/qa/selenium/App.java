package com.tcs.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    private static boolean initialized = false;
    private static boolean userLogged = false;
    private static WebDriver driver;

    public App() {
        System.out.println("Init App.class");

        if (!initialized){
            System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public boolean isUserLogged() {
        return userLogged;
    }

    public void setUserNoLogged() {
        userLogged = false;
    }

    public void setUserLogged() {
        userLogged = true;
    }

    public void setInitialized() {
        initialized = true;
    }

    public void setNotInitialized() {
        initialized = false;
    }

}
