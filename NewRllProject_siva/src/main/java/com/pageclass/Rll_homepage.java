package com.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Rll_homepage {
	WebDriver driver;
	By oneway=By.xpath("//small[text()='One Way']");
	By dropdown1=By.xpath("(//b[@role=\"presentation\"])[1]");
	By germany=By.xpath("(//small[text()=\"Germany\"])[2]");
	By dropdown2=By.xpath("(//b[@role=\"presentation\"])[2]");
	By Delhi=By.xpath("//small[text()=\"India\"]");
	By calendar=By.xpath("//input[@id=\"departure\"]");
	By Date=By.xpath("(//td[contains(text(),\"10\")])[1]");
    By  traveclk = By.xpath("//*[@id='onereturn']/div[4]/div");
    By  child = By.id("fchilds");
    By Search=By.xpath("//button[@id=\"flights-search\"]"); 
    By Flight_class=By.xpath("//select[@id=\"flight_type\"]");
    By Economy=By.xpath("//option[contains(text(),\"Economy\")]");
    //By stop=By.xpath("//input[@id=\"direct\"]");
    By allflights = By.xpath("//input[@id=\"all\"]");
    By hightolow = By.xpath("(//span[@class=\"d-block w-100 d-flex align-items-center justify-content-center gap-2\"])[2]");
   //By select = By.xpath("//button[contains(text(),"Select Flight")]");
    By selectingflight = By.xpath("(//button[contains(text(), 'Select Flight')])[1]");
	public Rll_homepage (WebDriver driver) {
		this.driver = driver;
	}
	
    public void onway() throws InterruptedException {
		
		driver.findElement(oneway).click();
		Thread.sleep(3000);
		
	}	
	public void Flying() throws InterruptedException {
		driver.findElement(dropdown1).click();
		driver.findElement(germany).click();
		Thread.sleep(2000);
	
		}
	 public void destination() throws InterruptedException {
		
		
        driver.findElement(dropdown2).click();
		driver.findElement(Delhi).click();	
		Thread.sleep(2000);
		
}
	 public void date() throws InterruptedException {
		
		driver.findElement(calendar).click();
		driver.findElement(Date).click();
		Thread.sleep(2000);
	}
	 public void traveller() throws InterruptedException
	 {
		// driver.findElement(traveclk).click();
		// Thread.sleep(2000);
		//driver.findElement(child).sendKeys("1");
	 }
	 public void search() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(Search).click();
	 }
	/*public void urlgetting() throws InterruptedException
	 {
		 String url = driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(1000);
		 driver.navigate().to(url);
	 }
	 public void selectingflightclass() throws InterruptedException
	 {
		 driver.findElement(Flight_class).click();
		 Thread.sleep(1000);
		
		 driver.findElement(Economy).isEnabled();
	 }
	 public void selectingdirect() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(allflights).click();
	 }
	 public void selectinghightolow() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(hightolow).click();
	 }
	 public void selectingflight() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(selectingflight).click();
	 }*/
	 

}
