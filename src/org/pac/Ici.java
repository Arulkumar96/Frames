package org.pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arul\\eclipse-workspace\\Frames\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	
//driver.switchTo().frame(0);
	driver.switchTo().frame("login_page");//or
	//WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
	//driver.switchTo().frame(frame);
 WebElement UserId = driver.findElement(By.xpath("//input[@type='text']"));
	UserId.sendKeys("98765");
}}