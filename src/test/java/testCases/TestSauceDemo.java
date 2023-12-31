package testCases;

import baseClass.BaseTestClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TestSauceDemo extends BaseTestClass {

    public LoginPage loginPage;
    public HomePage homePage ;

    @BeforeClass
    public void initBrowser(){
        initializeBrowser();
    }

    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        homePage.Select_Filter("Price (low to high)");
        homePage.logout();

    }

}
