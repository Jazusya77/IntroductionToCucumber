package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.com.DataTablesPage;

public class DataTables2_steps {


    DataTablesPage dtp =new DataTablesPage();


    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String firstname) throws InterruptedException {
        Thread.sleep(500);
        dtp.firstNameInput.sendKeys(firstname);
    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastname) throws InterruptedException {
        Thread.sleep(500);
       dtp.lastNameInput.sendKeys(lastname);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) throws InterruptedException {
        Thread.sleep(500);
        dtp.positionInput.sendKeys(position);
    }

    @Then("USer enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String name) throws InterruptedException {
        Thread.sleep(500);
       dtp.searchCreatedUser.sendKeys(name);
    }


    @Then("User should enter office {string}")
    public void user_should_enter_office(String office) throws InterruptedException {
        Thread.sleep(500);
     dtp.officeInput.sendKeys(office);
    }

    @Then("User should enter extension {string}")
    public void user_should_enter_extension(String extension) throws InterruptedException {
        Thread.sleep(500);
      dtp.extensionInput.sendKeys(extension);
    }

    @Then("User should enter start date {string}")
    public void user_should_enter_start_date(String startDate) throws InterruptedException {
        Thread.sleep(500);
        dtp.startDateInput.sendKeys(startDate);
    }

    @Then("User should enter salary {string}")
    public void user_should_enter_salary(String salary) throws InterruptedException {
        Thread.sleep(500);
        dtp.salaryInput.sendKeys(salary);
    }
    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String expectedName) throws InterruptedException {


        String expected = expectedName;
        Thread.sleep(500);
        String actual = dtp.nameOnTheList.getText();

        //TODO: fix this later
        Assert.fail();

        Thread.sleep(500);
        Assert.assertTrue("Name was not found!",actual.contains(expected));
    }

}
