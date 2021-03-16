package com.adat.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
	public static WebDriver driver;
	@FindBy(id="search_hotel")
private WebElement button;

	public Page4(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getButton() {
		return button;
	}
	
}
