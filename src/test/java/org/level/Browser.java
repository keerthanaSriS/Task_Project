package org.level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class Browser {

	private WebDriver driver;
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
	}
	@Test
	public void testExample() {
		driver.get("https://google.com");
		String title =  driver.getTitle();
		System.out.println("my title " + title);
		
	}
	@After
	public void teardown() {
		if (driver!= null ) {
			driver.quit();
		}
	}
	
	
}
