package com.adat.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement roomnumber;
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	@FindBy(id="adult_room")
	private WebElement adultroom;
@FindBy(id="child_room")
private WebElement childroom;
@FindBy(id="Submit")
private WebElement search;
	
	public Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getRoomnumber() {
	return roomnumber;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}
public WebElement getSearch() {
	return search;
}
	
}
