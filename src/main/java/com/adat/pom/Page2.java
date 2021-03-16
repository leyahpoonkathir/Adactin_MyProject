package com.adat.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	public static WebDriver driver;
	@FindBy(id="radiobutton_1")
private WebElement radiobutton1;
	@FindBy(id="radiobutton_2")
	private WebElement radiobutton2;
	@FindBy(id="radiobutton_2")
	private WebElement radiobutton3;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadiobutton1() {
		return radiobutton1;
	}
	public WebElement getRadiobutton2() {
		return radiobutton2;
	}
	public WebElement getRadiobutton3() {
		return radiobutton3;
	}
	public WebElement getRadiobutton4() {
		return radiobutton4;
	}
	@FindBy(id="radiobutton_2")
	private WebElement radiobutton4;
	@FindBy(id="continue")
	private WebElement button;
	public Page2(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getButton() {
		return button;
	}
	
}
