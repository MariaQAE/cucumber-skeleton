package steps;

import config.UserConfig;
import cucumber.api.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {

    SignInPage signInPage = new SignInPage();

    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);

    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}