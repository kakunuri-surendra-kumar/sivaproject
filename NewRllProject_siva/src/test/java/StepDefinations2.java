import org.openqa.selenium.WebDriver;

import com.pageclass.Booking1;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations2 {
	WebDriver driver;
    Booking1 booking;

    @Before
    public void setUp() {
        // Initialize WebDriver and Booking1 class here
        // Example: this.driver = new ChromeDriver();
        // this.booking = new Booking1(driver);
    }

    @Given("User is on Booking page of PHP Travels")
    public void user_is_on_booking_page_of_php_travels() {
        // Navigate to the booking page
        // Example: driver.get("URL_OF_BOOKING_PAGE");
    }

    @When("Field enter {string} and {string}")
    public void field_enter_firstname_and_lastname(String firstName, String lastName) {
        booking.Firstname();
        booking.lastname();
    }

    @When("User enter {string} and {string} in field")
    public void user_enter_email_and_phone_in_field(String email, String phone) {
        booking.email();
        booking.phone();
    }

    @When("User should enter {string}")
    public void user_should_enter_address(String address) {
        booking.address();
    }

    @When("Do enter {string} and {string} on")
    public void do_enter_nationality_and_current_country_on(String nationality, String currentCountry) throws InterruptedException {
        booking.Nationality();
        booking.currentCountry();
    }

    @When("User enter {string} from dropdowns")
    public void user_enter_title_from_dropdowns(String title) throws InterruptedException {
        booking.Title();
    }

    @When("User entered information as {string} and {string}")
    public void user_entered_information_as_traveller_fname_and_traveller_lname(String travellerFName, String travellerLName) {
        booking.Fname();
        booking.Lname();
    }

    @When("enters {string} and {string}")
    public void enters_nationality_and_date_of_birth(String nationality, String dateOfBirth) {
        booking.traveller_Nationality();
        booking.dob();
    }

    @When("enter {string} and {string} From DropDown")
    public void enter_birthday_and_birth_year_from_dropdown(String birthDay, String birthYear) throws InterruptedException {
        booking.Traveller_day();
        booking.traveller_year();
    }

    @When("User enter {string} within range")
    public void user_enter_passport_id_within_range(String passportID) throws InterruptedException {
        booking.passport();
    }

    @When("User enter {string} from dropdown issueyear")
    public void user_enter_issue_year_from_dropdown(String issueYear) throws InterruptedException {
        booking.pass_issu_yr();
    }

    @When("User select payment method as Pay Later")
    public void user_select_payment_method_as_pay_later() {
        booking.payment_method();
    }

    @When("User click on agree terms and conditions checkbox")
    public void user_click_on_agree_terms_and_conditions_checkbox() throws InterruptedException {
        booking.booking_done();
    }

    @When("click on Booking confirm")
    public void click_on_booking_confirm() throws InterruptedException {
        booking.confirm_button();
    }

    @Then("Booking must be success")
    public void booking_must_be_success() {
        // Verify booking success
        // Example: Assert.assertTrue(driver.findElement(By.id("success_message")).isDisplayed());
    }
}
