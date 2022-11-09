package org.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arul\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/");
	
	driver.switchTo().frame(1);
	System.out.println("inside the secondd farmes");
	Thread.sleep(2000);
	driver.switchTo().frame("frame2");
	}	
}