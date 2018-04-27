package com.tcs.qa.selenium;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {

    protected App app;

    public BasePage(App app) {
        System.out.println("Init BasePage.class");
        this.app = app;
        PageFactory.initElements(new AjaxElementLocatorFactory(app.getDriver(), 20), this);
    }

}
