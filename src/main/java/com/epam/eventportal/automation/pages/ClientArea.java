package com.epam.eventportal.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientArea extends BasePage {

    public ClientArea(WebDriver driver) { super(driver);}

    public WebElement getProposeTalkElement(){
        return driver.findElement(By.xpath("//button[text()='Propose a talk']"));
    }

    public void clickProposeTalk(){
        getProposeTalkElement().click();
    }

    public void fillForm(){
        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Masters");
        WebElement aboutArea = driver.findElement(By.id("tinymce"));
        aboutArea.sendKeys("This is about area");
        WebElement browse = driver.findElement(By.xpath("//span[text()='browse']"));
        browse.sendKeys("C:\\Users\\Shubham_Sharma\\Desktop\\Xpaths.xlsx");
    }

    public WebElement getRegistartionComplHeading(){
        return driver.findElement(By.xpath(" //h1[text()='Registration completed'"));
    }

    public WebElement getRegistrationMessage(){
        return driver.findElement(By.xpath("//p[contains(text(),'Your registration as')]"));
    }

}
