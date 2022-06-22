package demoPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(id="reg_email")
    private WebElement regEmailInput;

    @FindBy(id="reg_password")
    private WebElement regPasswordInput;

    @FindBy(name="register")
    private WebElement registerButton;

    @FindBy(xpath="//ul[@class='woocommerce-error']//li")
    private WebElement errors;

    @FindBy(id = "username")
    private WebElement userLogin;

    @FindBy(id = "password")
    private WebElement passwordLogin;

    @FindBy(name = "login")
    private WebElement buttonLogIn;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    private void register(String email, String password){
        regEmailInput.sendKeys(email);
        regPasswordInput.sendKeys(password);
        registerButton.click();
    }

    public LoggedUserPage registerUserValidDate(String email, String password){
        register(email, password);
        return new LoggedUserPage(driver);
    }
    public WebElement getErrors(){
        return errors;
    }

    public MyAccountPage registerUserInvalidDate(String email, String password){
        register(email, password);
        return this;
    }


    public LoggedUserPage loginUserIn(String email, String password){
        userLogin.sendKeys(email);
        passwordLogin.sendKeys(password);
        buttonLogIn.click();
        return new LoggedUserPage(driver);
    }

    public MyAccountPage unloginUserIn(String email, String password){
        userLogin.sendKeys(email);
        passwordLogin.sendKeys(password);
        buttonLogIn.click();
        return this;
    }

}
