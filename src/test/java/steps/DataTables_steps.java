package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.com.DataTablesPage;
import utilities.Driver;

public class DataTables_steps {

DataTablesPage dtpObj=new DataTablesPage();


    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {
        dtpObj.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
Assert.assertTrue(dtpObj.createNewEntry.isDisplayed());
    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
        dtpObj.firstNameInput.sendKeys("John");

    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
        dtpObj.lastNameInput.sendKeys("Doe");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
        dtpObj.positionInput.sendKeys("engineer");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
        dtpObj.officeInput.sendKeys("Chicago");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dtpObj.extensionInput.sendKeys("sjlhf");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
dtpObj.startDateInput.sendKeys("2019-03-03");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
       dtpObj.salaryInput.sendKeys("3423423");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
       dtpObj.createBtn.click();
    }

    @Then("USer enters first name to search box")
    public void user_enters_first_name_to_search_box() {
dtpObj.searchCreatedUser.sendKeys("John Doe");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {

        String expected="John";
        String actual=dtpObj.nameOnTheList.getText();
Assert.assertTrue(actual.contains(expected));
    }





}
