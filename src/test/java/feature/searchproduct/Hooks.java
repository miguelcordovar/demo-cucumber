package feature.searchproduct;

import com.demoqa.store.myaccount.MyAccountHomePage;
import com.tcs.qa.selenium.App;
import com.tcs.qa.selenium.BaseStep;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseStep {

    public Hooks(App app) {
        super(app);
    }

    @Before(value = "@First", order = 0)
    public void InitializeFeature() {
        System.out.println("------------- InitializeFeature -------------");
        app.getDriver().get("http://store.demoqa.com");
    }

    @Before(order=1)
    public void InitializeScenario(Scenario scenario) {
        System.out.println("InitializeScenario: " + scenario.getName());
    }

    @After(order=1)
    public void TearDownScenario(Scenario scenario) {
        System.out.println("TearDownScenario: " + scenario.getName());

        if (app.isUserLogged()) {
            MyAccountHomePage myAccountHomePage = new MyAccountHomePage(app);
            myAccountHomePage.clickBtnMyAccount();
            myAccountHomePage.clickBtnLogout();
            app.setUserNoLogged();
        }
    }

    @After(value="@First", order=0)
    public void TearDownFeature() {
        System.out.println("------------- TearDownFeature -------------");
        app.getDriver().quit();
    }

}
