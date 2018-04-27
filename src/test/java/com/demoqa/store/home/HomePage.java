package com.demoqa.store.home;

import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "account")
    private WebElement btnMyAccount;

    @FindBy(how = How.ID, using = "menu-item-15")
    private WebElement btnHome;

    @FindBy(how = How.NAME, using = "s")
    private WebElement txtSearch;


    public HomePage(App app) {
        super(app);
        System.out.println("Init HomePage.class");
    }


    public void clickBtnMyAccount() {
        this.btnMyAccount.click();
    }

    public void clickHomeButton() {
        this.btnHome.click();
    }

    public void setSearchText(String search) {
        this.txtSearch.sendKeys(search);
    }

    public void pressEnterSearchText() {
        this.txtSearch.sendKeys(Keys.RETURN);
    }
}
