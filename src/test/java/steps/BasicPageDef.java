package steps;

import cucumber.api.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();


    @Then("^Click \"([^\"]*)\" button$")
    public void clickButton(String text) {
        basicPage.clickButton(text);
    }

    @Then("^Click enter button")
    public void clickEnterButton() {
        basicPage.clickEnterButton();
    }

//    @Then("^Click \"([^\"]*)\" button$")
//    public void clickSubmitButton(String text) {
//        basicPage.clickSubmitButton(text);
//    }

    @Then("^Content with \"([^\"]*)\" visible$")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}
