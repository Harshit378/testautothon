package com.epam.eventportal.automation.tests;

import org.testng.annotations.*;

import com.epam.eventportal.automation.common.BrowserFactory;
import com.epam.eventportal.automation.common.CommonTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

public class BaseTest {  

  protected WebDriver driver;
  static final Logger logger = LogManager.getLogger(BaseTest.class);

  @BeforeSuite  
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
  
  @BeforeTest	
  @Parameters({"browser", "gridHubURL"})
  public void setUp(String browser, @Optional("gridHubURL") String gridHubURL, ITestContext testContext) {
	  logger.info("Grid Hub:"+gridHubURL+" , Browser: "+browser);
	  driver = BrowserFactory.createInstance(browser);
	  testContext.setAttribute("driver", driver);	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  

}
