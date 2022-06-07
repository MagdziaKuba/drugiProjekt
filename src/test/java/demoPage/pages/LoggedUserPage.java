package demoPage.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    //@FindBy(xpath = "//h1[@class='entry-title']")
    //@FindBy(linkText = "Dashboard")
    @FindBy(xpath = "//*[@id='page-7']/div/section/div/div/div/p[1]/a")
    private WebElement entryTitle;



    private  WebDriver driver;
    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public WebElement getEntryTitle(){
        return entryTitle;
    }

}
