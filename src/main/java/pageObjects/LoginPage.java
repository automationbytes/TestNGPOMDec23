package pageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTestClass {

    @FindBy(xpath = "//input[@name='user-name']")
    WebElement username_webEdit;

    By username_editbox = By.xpath("//input[@name='user-name']");
    By password_editbox = By.xpath("//input[@name='password']");
    By login_button = By.xpath("//input[@name='login-button']");


    public LoginPage(WebDriver driver){
        //findby
        PageFactory.initElements(driver,this);

        //by
        BaseTestClass.driver = driver;
    }

    //findby
    public void enterUsername(String user){
        username_webEdit.sendKeys(user);
    }

    //by
    public void enterPassword(String pass){
        driver.findElement(password_editbox).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(login_button).click();
    }

}
