package pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    WebDriver driver;

    public DataTablesPage(){

        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(xpath ="//div[.='Create new entry']")
    public WebElement createNewEntry;


    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstNameInput;

    @FindBy(xpath ="//input[@id='DTE_Field_last_name']" )
public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionInput;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeInput;



    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionInput;



    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateInput;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryInput;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createBtn;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchCreatedUser;


    @FindBy (xpath = "//table[@id='example']//tr[@id='row_58']//td[@class='sorting_1']")
    public WebElement nameOnTheList;
}
