package com.epam.eventportal.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.epam.eventportal.automation.common.CommonTask;
import com.epam.eventportal.automation.pages.AdminArea;
import com.epam.eventportal.automation.pages.EventDetailsDialog;
import com.epam.eventportal.automation.pages.HomePage;

public class AdminAreaTests extends BaseTest {

	HomePage homePage;
	AdminArea adminArea;
	private EventDetailsDialog eventDetailsDialog;
	static final Logger logger = LogManager.getLogger(AdminAreaTests.class);

	@Test(priority = 1)
	public void launchAppForAdmin() {
		CommonTask.launchApplicationAdmin(driver);
	}

	@Test(priority = 2)
	public void openAdminAreaAndClickNewEvent() {
		homePage = new HomePage(driver);
		homePage.openAdminArea();

		adminArea = new AdminArea(driver);
		adminArea.clickNewEvent();
	}

	@Test(priority = 3)
	public void enterEventDetails() {
		eventDetailsDialog = new EventDetailsDialog(driver);
		eventDetailsDialog.addEventDetails("Test Event Team05", "http://eventdetails.org", "08/08/2019", "08/08/2019",
				"Public");

	}

}
