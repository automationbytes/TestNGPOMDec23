package pageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends BaseTestClass{

    @FindBy(xpath = "//select[@data-test='product_sort_container']")
    WebElement product_sort_Dropdown;


    By product_sort_Dropdown1 = By.xpath("//select[@data-test='product_sort_container']");

    @FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
    WebElement menu_Button;

    @FindBy(xpath = "//a[@id=\"logou_sidebar_link\"]")
    WebElement logout_Button;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        BaseTestClass.driver = driver;
    }


//    public void SelectFilter(String value){
//        Select dropdown = new Select(product_sort_Dropdown);
//        dropdown.selectByValue(value);
//    }

    public void Select_Filter(String value){
        Select dropdown = new Select(driver.findElement(product_sort_Dropdown1));
        dropdown.selectByVisibleText(value);
    }
public void logout(){

//normal by
// driver.findElement(By.xpath("")).sendKeys();
// driver.findElement(webelement).sendKeys();
    //findby
//    webelement.sendKeys();

    menu_Button.click();
        logout_Button.click();
}


}
