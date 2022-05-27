package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageStep {

    LoginPage loginpage = new LoginPage(DriverFactory.getDriver());

    //<editor-fold desc="@Check Scenario">
    @Given("Enes is on Home page")
    public void enes_is_home_page() {
        loginpage.checkHomePage();
    }

    @When("click {string} card in the top rigt")
    public void clickCardInTheTopRigt(String Giris) {
        loginpage.HomeLoginBut(Giris);
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginpage.LoginPageCheck();
    }
    //</editor-fold>

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginpage.ClickLogin();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String text) {
        loginpage.EpostaRadioBut(text);
        loginpage.EpostaRadioButClick();
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String Giris) {
        loginpage.LoginPageCheck2(Giris);
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String EPosta ) {
        loginpage.EpostaRadioBut(EPosta);
    }

    @Then("should see {string}  radio buttons")
    public void shouldSeeRadioButtons(String Telefon) {
        loginpage.TelefonRadioBut(Telefon);
    }


    @Then("should see textbox on Email")
    public void shouldSeeTextboxOnEmail() {
        loginpage.Epostatextbox();
    }

    @Then("should see textbox on Password")
    public void shouldSeeTextboxOnPassword() {
        loginpage.Passtextbox();
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginpage.ShowPass();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String Text) {
        loginpage.RemembermeBut(Text);
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String Text) {
        loginpage.ForgatPass(Text);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String Text) {
        loginpage.LoginButCheck(Text);
    }

    @When("click {string} telefon radio button")
    public void clickTelefonRadioButton(String arg0) {
        loginpage.TelefonRadioButton();
    }
    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginpage.TelefonTextBox();
    }


}
