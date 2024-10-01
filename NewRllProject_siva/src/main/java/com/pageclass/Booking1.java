package com.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.messages.types.Duration;


public class Booking1 {
	WebDriver driver;
	By Firstclass=By.xpath("//option[contains(text(),\"First\")]");
    By oneway_airlines=By.xpath("//input[@id=\"oneway_flights_2\"]");
    By Search=By.xpath("//button[@id=\"flights-search\"]");
    By select=By.xpath("//button[contains(text(),\"Select Flight\")]");
    By Firstname=By.xpath("(//input[@type=\"text\" and @class=\" form-control\"])[1]");
    By lastname=By.xpath("(//input[@type=\"text\" and @class=\" form-control\"])[2]");
	By email=By.xpath("//input[@type=\"text\" and @placeholder=\"Email\"]");
	By phone=By.xpath("//input[@type=\"text\" and @placeholder=\"Phone\"]");
	By address1=By.xpath("//input[@type=\"text\" and @placeholder=\"Address\"]");
	By Nationality=By.xpath("(//button[@role=\"combobox\" and @type=\"button\"])[1]");
	By selectIndia=By.xpath("(//span[contains(text(),\"India\")])[2]");
	By currentCountry=By.xpath("(//button[@role=\"combobox\" and @type=\"button\"])[2]");
	By selectCountry=By.xpath("(//span[contains(text(),\"India\")])[4]");
	By Title=By.xpath("//select[@name=\"title_1\"]");
	By miss=By.xpath("//option[contains(text(),\"Miss\")]");
	By traveller_Fname=By.xpath("//input[@name=\"first_name_1\"]");
	By travleller_Lname=By.xpath("//input[@name=\"last_name_1\"]");
	By traveller_Nationality=By.xpath("//select[@name=\"nationality_1\"]");
	By select_traveller_nationality=By.xpath("(//option[contains(text(),\"India\")])[2]");
	By dob=By.xpath("//select[@name=\"dob_month_1\"]");
	By selectdob=By.xpath("//option[contains(text(),\"12 Dec\")][1]");
	By Traveller_day=By.xpath("//select[@name=\"dob_day_1\"]");
	By select_Traveller_day=By.xpath("(//option[contains(text(),\"14\")])[1]");
	By traveller_year=By.xpath("//select[@name=\"dob_year_1\"]");
	By select_traveller_year=By.xpath("(//option[contains(text(),\"1999\")])[1]");
	By passport=By.xpath("//input[@name=\"passport_1\"]");
	By pass_issu_yr=By.xpath("(//select[@class=\"form-select form-select\"])[6]");
	By select_pass_issu_yr=By.xpath("(//option[contains(text(),\"2023\")])[2]");
	By payment_method=By.xpath("(//div[@id=\"pills-home-tab\"])[3]");
	By agree=By.xpath("//input[@id=\"agreechb\"]");
	By confirm_button=By.xpath("//button[@id=\"booking\"]");
	
	public Booking1 (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Firstname()  {
		
	 driver.findElement(Firstname).sendKeys("siva");
		
		
		}
		public void lastname() {
			driver.findElement(lastname).sendKeys("kumari");
			}
		
		
		public void email() {
			driver.findElement(email).sendKeys("siva@gmail.com");
			}
		public void phone() {
			driver.findElement(phone).sendKeys("9022769542");}
		
		
		public void address() {
			driver.findElement(address1).sendKeys("Kharadi bypass, Pune");}
		
		public void Nationality() throws InterruptedException {
			driver.findElement(Nationality).click();
			Thread.sleep(3000);
			driver.findElement(selectIndia).click();}
			
		
		
		public void currentCountry() throws InterruptedException {
			driver.findElement(currentCountry).click();
			Thread.sleep(3000);
			driver.findElement(selectCountry).click();}
		
		public void Title() throws InterruptedException {
		Thread.sleep(3000);
			driver.findElement(Title).click();
		Thread.sleep(3000);
			driver.findElement(miss).click();}
		
		
		
		public void Fname() {
			driver.findElement(traveller_Fname).sendKeys("siva");}
		
		
		public void Lname() {
			driver.findElement(travleller_Lname).sendKeys("kumari");}
		
		public void traveller_Nationality() {
			driver.findElement(traveller_Nationality).click();
			driver.findElement(select_traveller_nationality).click();}
		
		public void dob() {
			driver.findElement(dob).click();
			driver.findElement(selectdob).click();}
		
		public void Traveller_day() {
			driver.findElement(Traveller_day).click();
			driver.findElement(select_Traveller_day).click();}
		
		public void traveller_year() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(traveller_year).click();
			driver.findElement(select_traveller_year).click();}
		
		public void passport() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(passport).sendKeys("141414");}
		
		public void pass_issu_yr() throws InterruptedException {
			driver.findElement(pass_issu_yr).click();
			Thread.sleep(3000);
			driver.findElement(select_pass_issu_yr).click();
			Thread.sleep(3000);}
		
	/*	public void arrow_down_key() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.ARROW_DOWN).perform();
	    
		}*/
		
		
		public void payment_method() {
		    driver.findElement(payment_method).click();
	 
			
			}
		
		public void booking_done() throws InterruptedException{
			
			Thread.sleep(4500);
	 
			driver.findElement(agree).click();
		}
			public void confirm_button() throws InterruptedException {
			Thread.sleep(4500);
			driver.findElement(confirm_button).click();
	 
			
	 
	 
	}
  }
	 


