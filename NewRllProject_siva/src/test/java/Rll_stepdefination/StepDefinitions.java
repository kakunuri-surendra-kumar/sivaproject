package Rll_stepdefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageclass.Rll_homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    WebDriver driver;
    Rll_homepage homepage;

    @Given("I open the browser and navigate to the flight booking page")
    public void i_open_the_browser_and_navigate_to_the_flight_booking_page() {
        driver = new ChromeDriver();
        homepage = new Rll_homepage(driver);
        driver.get("https://phptravels.net/flights");
    }

    @When("I select one way trip")
    public void i_select_one_way_trip() throws InterruptedException {
        homepage.onway();
    }

    @When("I choose Germany as the departure country")
    public void i_choose_germany_as_the_departure_country() throws InterruptedException {
        homepage.Flying();
    }

    @When("I choose India as the destination country")
    public void i_choose_india_as_the_destination_country() throws InterruptedException {
        homepage.destination();
    }

    @When("I select the departure date")
    public void i_select_the_departure_date() throws InterruptedException {
        homepage.date();
    }

    @When("I select the number of travelers")
    public void i_select_the_number_of_travelers() throws InterruptedException {
        homepage.traveller();
    }

    @Then("I click on the search button")
    public void i_click_on_the_search_button() throws InterruptedException {
        homepage.search();
    }
    
}
