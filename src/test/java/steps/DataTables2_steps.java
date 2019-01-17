package steps;

import cucumber.api.java.en.Then;
import pages.com.DataTablesPage;

public class DataTables2_steps {


    DataTablesPage dtp =new DataTablesPage();


    @Then("User should enter firstname {string}")
    public void user_should_enter_firstname(String firstname) {
        dtp.firstNameInput.sendKeys(firstname);
    }

    @Then("User should enter lastname {string}")
    public void user_should_enter_lastname(String lastname) {
       dtp.lastNameInput.sendKeys(lastname);
    }

    @Then("User should enter position {string}")
    public void user_should_enter_position(String position) {
      dtp.positionInput.sendKeys(position);
    }

    @Then("USer enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String name) {
       dtp.firstNameInput.sendKeys(name);
    }

    @Then("User should see first name is {string} inserted in the table")
    public void user_should_see_first_name_i_s_inserted_in_the_table(String name) {
        dtp.firstNameInput.sendKeys(name);
    }

}
