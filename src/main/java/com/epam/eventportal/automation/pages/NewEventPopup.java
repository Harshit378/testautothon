package com.epam.eventportal.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewEventPopup extends BasePage {
	
	private By newEventButton = By.id("new_event_btn");	
	
	public NewEventPopup(WebDriver driver) {
		super(driver);
	}		
	
	
	public void clickNewEvent() {
		driver.findElement(newEventButton).click();
	}
	

}
