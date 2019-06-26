package com.epam.eventportal.automation.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebdriverHelper {

	static final Logger logger = LogManager.getLogger(WebdriverHelper.class);
	
	private static WebdriverHelper webdriverHelper;
	
	public static WebdriverHelper getInstance() {
		if (webdriverHelper == null) {
			webdriverHelper = new WebdriverHelper();
		}
		return webdriverHelper;
	}

	public void checkRadioButton(WebElement element) {
		if (!element.isSelected()) {
			element.click();
		}
		logger.info("Element is already checked");
	}
	
	public void expandAdminSectionIfCollapsed(WebElement element) {
		WebElement expandCollapseIcon = element.findElement(By.xpath("//div"));
		String classAttribute = expandCollapseIcon.getAttribute(Constants.ATTRIBUTE_CLASS);
		if ("fa arrow fa-angle-right".equals(classAttribute)) {
			element.click();
		}
		logger.info("Navigation element is already expanded");		
	}
	

}
