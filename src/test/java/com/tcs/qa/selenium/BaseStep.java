package com.tcs.qa.selenium;

public class BaseStep {

    protected App app;

    public BaseStep(App app) {
        System.out.println("Init BaseStep.class");
        this.app = app;
    }

}
