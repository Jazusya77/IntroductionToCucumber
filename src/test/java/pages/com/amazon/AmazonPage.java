package pages.com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

WebDriver driver;
    public AmazonPage(){

        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

@FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

@FindBy(xpath = "//a[@id='bcKwText']/span")
    public WebElement headphones;

@FindBy(xpath = "//input[@class='nav-input']")
public WebElement searchButton;

}
