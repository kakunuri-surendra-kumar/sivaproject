package com.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filterpage {
	public filterpage(WebDriver driver) {
	//	super();
		this.driver = driver;
	}
	WebDriver driver;
//	driver.get("https://phptravels.net/flights/ber/del/oneway/economy/10-10-2024/1/0/0");
	By Flight_class=By.xpath("//select[@id=\"flight_type\"]");
    By Economy=By.xpath("//option[contains(text(),\"Economy\")]");
    //By stop=By.xpath("//input[@id=\"direct\"]");
    By allflights = By.xpath("//input[@id=\"all\"]");
    By hightolow = By.xpath("(//span[@class=\"d-block w-100 d-flex align-items-center justify-content-center gap-2\"])[2]");
   //By select = By.xpath("//button[contains(text(),"Select Flight")]");
    By selectingflight = By.xpath("(//button[contains(text(), 'Select Flight')])[1]");
    
    public void navigate()
    {
    	driver.get("driver.get(\"https://phptravels.net/flights/ber/del/oneway/economy/10-10-2024/1/0/0\")");
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
	 }

}
