package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.com.wikipedia.WikipediaPage;
import utilities.Driver;

public class Wikipedia_steps {

    WikipediaPage wikiPage= new WikipediaPage();


    @Given("User is on the Wikipedia homepage")
    public void user_is_on_the_Wikipedia_homepage() {
        Driver.getDriver().get("http://wikipedia.org");
    }

    @When("User enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {

wikiPage.wikiSearchBox.sendKeys("Steve Jobs"+ Keys.ENTER);

    }

    @Then("User should see the first header is displayed steve fobs")
    public void user_should_see_the_first_header_is_displayed_steve_fobs() {

        String actualText= wikiPage.header.getText();
        String expectedText="Steve Jobs";

        Assert.assertEquals("does not match",actualText, expectedText);
        System.out.println(actualText);
    }
}
