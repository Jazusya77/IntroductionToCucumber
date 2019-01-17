package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.com.com.google.GooglePage;
import utilities.Driver;

public class GoogleSearch_steps {

    GooglePage gpage =new GooglePage();


    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("http://google.com");
    }

    @Given("User enters flowers")
    public void user_enters_flowers() {
        gpage.searchBox.sendKeys("flowers");
    }

    @Given("User clicks search button")
    public void user_clicks_search_button() {
       gpage.searchButton.click();
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
       String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword flowers was not located in title",actualTitle.contains("flowers"));
    }


}
