package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {


    By Logo = By.cssSelector(".header__middle__left .main-header-logo");
    By HomeLoginbut = By.cssSelector(".user-wrapper .dropdown-label");
    By Loginpagecheck = By.xpath("//div[@id='login']/div[@class='container']//div[@class='login-form']");
    By Epostaradiobut = By.cssSelector(".login-form__radio-buttons--first-label [type]");
    By EpostaradiobutCheck = By.cssSelector(".login-form__radio-buttons--first-label .login-form__radio-buttons--span");
    By TelefonRadioButText = By.cssSelector(".login-form__radio-buttons--second-label .login-form__radio-buttons--span");
    By TelefonRadioBut = By.name("loginType");
    By epostatextbox = By.name("email");
    By passtextbox = By.name("password");
    By showpassbut = By.cssSelector(".login-form__password .login-form__show-password-icon");
    By rememberMe = By.cssSelector(".login-form__forgot-password-link");
    By forgatpass = By.cssSelector(".login-form__forgot-password-link");
    By loginbut = By.cssSelector(".login-form__button login-form__button--bg-blue");
    By TelefonTextBox = By.cssSelector(".login-form__phone.text-input");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void checkHomePage() {
        helper.checkElementPresence(Logo);
    }

    public void HomeLoginBut(String Giris) {
        helper.clickElementWithText(HomeLoginbut, Giris);
    }

    public void LoginPageCheck() {
        helper.checkElementPresence(Loginpagecheck);
    }

    public void EpostaRadioBut(String text) {
        helper.checkElementWithText(EpostaradiobutCheck, text);
    }

    public void TelefonRadioBut(String text) {
        helper.checkElementWithText(TelefonRadioButText, text);
    }

    public void EpostaRadioButClick() {
        helper.click(Epostaradiobut);
    }

    public void ClickLogin() {
        helper.click(HomeLoginbut);
    }

    public void LoginPageCheck2(String text) {
        helper.checkElementText(Loginpagecheck, text);
    }

    public void Epostatextbox(){
        helper.checkElementPresence(epostatextbox);
    }
    public void Passtextbox(){
        helper.checkElementPresence(passtextbox);
    }
    public void ShowPass(){
        helper.checkElementPresence(showpassbut);
    }

    public void RemembermeBut (String Text){
        helper.checkElementText(rememberMe, Text);
    }
    public void ForgatPass (String Text){
        helper.checkElementText(forgatpass,Text);
    }
    public void LoginButCheck (String Text){
        helper.checkElementText(loginbut, Text);
    }
    public void TelefonRadioButton() {
        helper.click(TelefonRadioBut);
    }
    public void TelefonTextBox(){
        helper.checkElementPresence(TelefonTextBox);
    }
}
