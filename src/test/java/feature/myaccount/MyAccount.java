package feature.myaccount;

import com.demoqa.store.home.HomePage;
import com.demoqa.store.myaccount.LoginPage;
import com.demoqa.store.myaccount.MyAccountHomePage;
import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyAccount extends BaseStep {

    public MyAccount(App app) {
        super(app);
        System.out.println("Init MyAccount.class");
    }


    @Given("^I navigate to the My Account login page$")
    public void iNavigateToTheMyAccountLoginPage() throws Throwable {
        System.out.println("Go to My Account login page");

        HomePage homePage = new HomePage(app);
        homePage.clickBtnMyAccount();
    }

    @And("^I enter username as \"([^\"]*)\" and the password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndThePasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter username: " + username);
        System.out.println("Enter password: " + password);

        LoginPage loginPage = new LoginPage(app);

        loginPage.setUserName(username);
        loginPage.setPassword(password);

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click Login button");

        LoginPage loginPage = new LoginPage(app);
        loginPage.clickLogin();

    }

    @Then("^I should see the My Account home page$")
    public void iShouldSeeTheMyAccountHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I see the My Account Home page");

        String expected = "testuser";
        MyAccountHomePage myAccountHomePage = new MyAccountHomePage(app);
        String actual = myAccountHomePage.getUsername();
        app.setUserLogged();
        Assert.assertEquals(expected, actual);

    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I see the error message: " + message);

        String expected = message;

        LoginPage loginPage = new LoginPage(app);
        String actual = loginPage.getErrorMessage();

        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
}
