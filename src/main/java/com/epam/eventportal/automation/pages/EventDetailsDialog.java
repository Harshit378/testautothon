package com.epam.eventportal.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class EventDetailsDialog extends BasePage {

	public EventDetailsDialog(WebDriver driver) {
		super(driver);
	}

	public void addEventDetails(String titleStr, String URLStr, String startDateStr, String endDateStr,
			String privacyStr) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[text()='Event Title*']//following-sibling::div//input")));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@title='Public']//following-sibling::select")));
		WebElement title = driver.findElement(By.xpath("//div[text()='Event Title*']//following-sibling::div//input"));
		WebElement URL = driver.findElement(By.id("//div[text()='Suggested URL*']//following-sibling::div//input"));
		WebElement startDate = driver.findElement(By.id("//input[@name='start']"));
		WebElement endDate = driver.findElement(By.id("//input[@name='end']"));
		WebElement privacySetting = driver.findElement(By.xpath("//button[@title='Public']/following-sibling::select"));

		title.sendKeys(titleStr);
		URL.sendKeys(URLStr);
		startDate.sendKeys(startDateStr);
		endDate.sendKeys(endDateStr);
		new Select(privacySetting).selectByVisibleText(privacyStr);

		logger.info("Entered Event Details");

	}

	

}
