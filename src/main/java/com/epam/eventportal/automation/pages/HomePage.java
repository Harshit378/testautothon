package com.epam.eventportal.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);		
	}
	
	public void openAdminArea() {
		WebElement profilePhoto = driver.findElement(By.xpath("//div[@class=\"evnt-profile-photo\"]/img"));
		profilePhoto.click();
		
		WebElement adminAreaLink = driver.findElement(By.xpath("//a[text()='Admin Area']"));
		adminAreaLink.click();
	}
	
	
}
