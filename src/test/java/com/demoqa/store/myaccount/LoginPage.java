package com.demoqa.store.myaccount;

import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "log")
    private WebElement txtUserName;

    @FindBy(how = How.ID, using = "pwd")
    private WebElement txtPassword;

    @FindBy(how = How.ID, using = "login")
    private WebElement btnLogin;

    @FindBy(how = How.CLASS_NAME, using = "response")
    private WebElement lblErrorMessage;

    public LoginPage(App app) {
        super(app);
        System.out.println("Init LoginPage.class");
    }

    public void setUserName(String username) {
        this.txtUserName.sendKeys(username);
    }

    public void setPassword(String password) {
        this.txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        this.btnLogin.click();
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(app.getDriver(), 10);
        wait.until(ExpectedConditions.textToBePresentInElement(this.lblErrorMessage,"ERROR"));

        return this.lblErrorMessage.getText();
    }

}
