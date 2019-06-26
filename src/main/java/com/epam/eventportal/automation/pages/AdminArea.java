package com.epam.eventportal.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.epam.eventportal.automation.common.WebdriverHelper;

public class AdminArea extends BasePage {

	public AdminArea(WebDriver driver) {
		super(driver);
	}

	public void enterEventDetails(String eventTitleStr, String suggestedURLStr, String startDateStr, String endDateStr,
			String privacyStr) {
		WebElement eventTitle = driver
				.findElement(By.xpath("//div[text()='Event Title*']//following-sibling::div//input"));
		WebElement suggestedURL = driver
				.findElement(By.xpath("//div[text()='Suggested URL*']//following-sibling::div//input"));
		WebElement startDate = driver.findElement(By.xpath("//input[@name='start']"));
		WebElement endDate = driver.findElement(By.xpath("//input[@name='end']"));
		WebElement privacySetting = driver.findElement(By.xpath("//a//span[text()='Public']"));

		eventTitle.sendKeys(eventTitleStr);
		suggestedURL.sendKeys(suggestedURLStr);
		startDate.sendKeys(startDateStr);
		endDate.sendKeys(endDateStr);
		privacySetting.sendKeys(privacyStr);

		logger.info("Entered Event Details");

	}

	public void selectSpeakerRegistration() {
		WebElement speakerRegistration = driver.findElement(By.id("speakerReg"));
		WebdriverHelper.getInstance().checkRadioButton(speakerRegistration);
	}

	public void expandPagesSection() {
		WebElement pagesSection = driver.findElement(By.xpath("//span[text()='Pages']"));
		WebdriverHelper.getInstance().expandAdminSectionIfCollapsed(pagesSection);
	}

	public void clickAddPage() {
		WebElement addPageButton = driver.findElement(By.id("add-page"));
		addPageButton.click();
	}

	public void selectPageType(String pageType) {
		WebElement pageTypeDropdown = driver.findElement(By.xpath(
				"//div[./div[contains(text(),'Page Type*')]]//div[@class='dropdown-menu open']//following-sibling::select"));
		Select pageTypeSelect = new Select(pageTypeDropdown);
		pageTypeSelect.selectByVisibleText(pageType);
	}

	public void clickAddPageButton() {
		WebElement addPageButton = driver.findElement(By.xpath("//button[text()='Add']"));
		addPageButton.click();
	}

	public void clickNewEvent() {
		WebElement newEventButton = driver.findElement(By.id("new_event_btn"));
		newEventButton.click();
		logger.info("Clicked New Event button");

	}

}
