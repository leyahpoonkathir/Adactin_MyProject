package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;


import com.adactin.runner.Runner;

import com.automation.base.BaseClass;
import com.configuration.helper.FileReaderManager;
import com.configuration.helper.ProjectObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	public static WebDriver driver = Runner.driver;
	ProjectObjectManager pom=new ProjectObjectManager(driver);
	
 @Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getIntanceCR().getUrl();
		getUrl(url);
		
	}@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String userName) throws Throwable {
		
	    inputValueElement(pom.getLogin().getUsername(), userName);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputValueElement(pom.getLogin().getPassword(), password);
	}

	@Then("^user Click On The Login Button And Is Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Is_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	    clickOnElement(pom.getLogin().getLogin());
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	    dropDown(pom.getSearch().getLocation(), "value", "Adelaide");
	}

	@When("^user Select The Hotels In Hotel Field$")
	public void user_Select_The_Hotels_In_Hotel_Field() throws Throwable {
	   dropDown(pom.getSearch().getHotels(), "value", "3");
	}

	@When("^user Select The RoomType In RoomType Field$")
	public void user_Select_The_RoomType_In_RoomType_Field() throws Throwable {
	    dropDown(pom.getSearch().getRoom_type(), "value", "4");
	}

	@When("^user Select The NumberOfRoom In NumberOfRoom Field$")
	public void user_Select_The_NumberOfRoom_In_NumberOfRoom_Field() throws Throwable {
	    dropDown(pom.getSearch().getRoomnumber(), "value", "2");
	}

	@When("^user Enter The CheckInDate In CheckInDate Field$")
	public void user_Enter_The_CheckInDate_In_CheckInDate_Field() throws Throwable {
	    inputValueElement(pom.getSearch().getCheckindate(), "13/03/2021");
	}

	@When("^user Enter The CheckOutDate In CheckOutDate Field$")
	public void user_Enter_The_CheckOutDate_In_CheckOutDate_Field() throws Throwable {
	    inputValueElement(pom.getSearch().getCheckoutdate(), "14/03/2021");
	}

	@When("^user Select The AdultsPerRoom In AdultsPerRoom Field$")
	public void user_Select_The_AdultsPerRoom_In_AdultsPerRoom_Field() throws Throwable {
	   dropDown(pom.getSearch().getAdultroom(), "value", "3");
	}

	@When("^user Select The ChildrenPerRoom In ChildrenPerRoom Field$")
	public void user_Select_The_ChildrenPerRoom_In_ChildrenPerRoom_Field() throws Throwable {
	    dropDown(pom.getSearch().getChildroom(), "value", "1");
	}

	@Then("^user Click On The Search Button And Is Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Is_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	    clickOnElement(pom.getSearch().getSearch());
	}

	@When("^Click On The Radio Button1$")
	public void click_On_The_Radio_Button() throws Throwable {
	    clickOnElement(pom.getSelect().getRadiobutton1());
	    Thread.sleep(3000);
	}
//	@And("^Click On The Radio Button2$")
//	public void click_On_The_Radio_Button1() throws Throwable {
//	    clickOnElement(select.getRadiobutton2());
//	}
//	@And("^Click On The Radio Button3$")
//	public void click_On_The_Radio_Button11() throws Throwable {
//	    clickOnElement(select.getRadiobutton3());
//	}
//	@And("^Click On The Radio Button4$")
//	public void click_On_The_Radio_Button111() throws Throwable {
//	    clickOnElement(select.getRadiobutton4());
//	}

	@Then("^user Click On The Continue Button And Is Navigate To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Is_Navigate_To_The_Book_Hotel_Page() throws Throwable {
	    clickOnElement(pom.getSelect().getButton());
	}

	@When("^user Enter The FirstName In FirstName Field$")
	public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
	    inputValueElement(pom.getBook().getName(), "priya");
	}

	@When("^user Enter The LastName In LastName Field$")
	public void user_Enter_The_LastName_In_LastName_Field() throws Throwable {
	   inputValueElement(pom.getBook().getLastname(), "poonkathir");
	}

	@When("^user Enter The BillingAddress In BillingAddress Field$")
	public void user_Enter_The_BillingAddress_In_BillingAddress_Field() throws Throwable {
	    inputValueElement(pom.getBook().getAddress(), "23/10 aplot");
	}

	@When("^user Enter The CreditCardNumber In CreditCardNumber Field$")
	public void user_Enter_The_CreditCardNumber_In_CreditCardNumber_Field() throws Throwable {
	   inputValueElement(pom.getBook().getCreditcard(), "1234567891912134");
	}

	@When("^user Select The CreditCardType In CreditCardType Field$")
	public void user_Select_The_CreditCardType_In_CreditCardType_Field() throws Throwable {
	    dropDown(pom.getBook().getCctype(), "value", "VISA");
	}

	

	@When("^user Select The Month In Month Field$")
	public void user_Select_The_Month_In_Month_Field() throws Throwable {
	   dropDown(pom.getBook().getExpmonth(),"value", "4");
	}

	@When("^user Select The Year In Year Field$")
	public void user_Select_The_Year_In_Year_Field() throws Throwable {
	    dropDown(pom.getBook().getExpyear(), "value", "2022");
	}

	@When("^user Enter The CVVNumber In CVVNumber Field$")
	public void user_Enter_The_CVVNumber_In_CVVNumber_Field() throws Throwable {
	    inputValueElement(pom.getBook().getCvv(), "234");
	}

	@Then("^user Click The BookNow Button And Is Navigate To The Booking Conformation Page$")
	public void user_Click_The_BookNow_Button_And_Is_Navigate_To_The_Booking_Conformation_Page() throws Throwable {
	    clickOnElement(pom.getBook().getBook());
	    Thread.sleep(3000);
	  
	}

	@When("^user Click The SearchHotel Button$")
	public void user_Click_The_SearchHotel_Button() throws Throwable {
	    clickOnElement(pom.getconfirm().getButton());
	    
	}

//	@Then("^user Click The LogOut Button$")
//	public void user_Click_The_LogOut_Button() throws Throwable {
//	    
//	}


	
	
}
