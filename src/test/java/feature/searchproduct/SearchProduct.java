package feature.searchproduct;

import com.demoqa.store.home.HomePage;
import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchProduct extends BaseStep {

    public SearchProduct(App app) {
        super(app);
    }

    @Given("^I navigate to the Home Page$")
    public void iNavigateToTheHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage(app);
        homePage.clickHomeButton();
    }

    @And("^I enter \"([^\"]*)\" in the search text box and press Enter key$")
    public void iEnterInTheSearchTextBoxAndPressEnterKey(String search) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage(app);
        homePage.setSearchText(search);
        homePage.pressEnterSearchText();
    }


    @Then("^I should see the the iPhone products list$")
    public void iShouldSeeTheTheIPhoneProductsList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Iphone List");
        Thread.sleep(5000);
    }


}
