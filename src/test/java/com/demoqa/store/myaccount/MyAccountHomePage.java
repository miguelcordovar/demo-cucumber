package com.demoqa.store.myaccount;

import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountHomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"wp-admin-bar-my-account\"]/a/span")
    private WebElement lblUsername;

    @FindBy(how = How.ID, using = "account_logout")
    private WebElement btnLogout;

    @FindBy(how = How.ID, using = "account")
    private WebElement btnMyAccount;

    public MyAccountHomePage(App app) {
        super(app);
        System.out.println("Init MyAccountHomePage.class");
    }

    public String getUsername() {
        return this.lblUsername.getText();
    }

    public void clickBtnLogout() {
        this.btnLogout.click();
    }

    public void clickBtnMyAccount() {
        this.btnMyAccount.click();
    }

}
