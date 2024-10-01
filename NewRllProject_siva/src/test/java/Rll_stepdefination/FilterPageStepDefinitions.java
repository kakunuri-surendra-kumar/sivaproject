package Rll_stepdefination;


	//package com.pageclass;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageclass.filterpage;

import io.cucumber.java.en.*;
	import io.cucumber.java.Before;

	public class FilterPageStepDefinitions {
	    WebDriver driver = new ChromeDriver();
	  filterpage filter;

	    @Before
	    public void setUp() {
	        driver.get("\"driver.get(\\\"https://phptravels.net/flights/ber/del/oneway/economy/10-10-2024/1/0/0\\\")");
	    }

	    @Given("User navigates to the flight booking page")
	    public void user_navigates_to_the_flight_booking_page() {
	        filter.navigate();
	    }

	    @When("User selects all flights")
	    public void user_selects_all_flights() throws InterruptedException {
	        filter.selectingdirect();
	    }

	    @When("User sorts flights from high to low")
	    public void user_sorts_flights_from_high_to_low() throws InterruptedException {
	        filter.selectinghightolow();
	    }

	    @When("User selects the first available flight")
	    public void user_selects_the_first_available_flight() throws InterruptedException {
	        filter.selectingflight();
	    }

	    @Then("The flight should be selected successfully")
	    public void the_flight_should_be_selected_successfully() {
	        // Verify flight selection success
	        // Example: Assert.assertTrue(driver.findElement(By.id("success_message")).isDisplayed());
	    }
	}



