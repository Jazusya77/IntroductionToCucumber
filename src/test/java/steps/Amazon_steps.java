package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.com.amazon.AmazonPage;
import utilities.Driver;

public class Amazon_steps {

AmazonPage amazonPage=new AmazonPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("http://amazon.com");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
amazonPage.searchBox.sendKeys("headphones");
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() throws InterruptedException {
    amazonPage.searchButton.click();
    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
String actualText=amazonPage.headphones.getText();
String expectedText= "\"headphones\"";

        Assert.assertEquals(actualText,expectedText);
    }
}
