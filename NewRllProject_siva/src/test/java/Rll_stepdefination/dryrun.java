package Rll_stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageclass.Rll_homepage;
import com.pageclass.filterpage;
//import com.pageclass.filterclass;

public class dryrun {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//Rll_homepage p = new Rll_homepage(driver);
		//driver.get("https://phptravels.net/flights");
		//filterclass l = new filterclass();
		filterpage p1 = new filterpage();
		//p.onway();
	//	p.Flying();
	//	p.destination();
	//	p.date();
	//	p.traveller();
	//	p.search();
//		p.urlgetting();
//		//p.selectingflightclass();
//		p.selectingdirect();
//		p.selectinghightolow();
//		p.selectingflight();
//		driver.get("https://phptravels.net/flight/booking");
//		p.urlgetting();
	//	p1.selectinghightolow();
	}	

}
