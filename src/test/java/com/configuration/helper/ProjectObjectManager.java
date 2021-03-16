package com.configuration.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adat.pom.Page;
import com.adat.pom.Page1;
import com.adat.pom.Page2;
import com.adat.pom.Page3;
import com.adat.pom.Page4;

public class ProjectObjectManager {
	public WebDriver driver;
	private Page login;
	private Page1 search;
	private Page2 select;
	private Page3 book;
	private Page4 confirm;
	public ProjectObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Page getLogin() {
		 login=new Page(driver);
return login;
	}
	public Page1 getSearch() {
		 search=new Page1(driver);
return search;
	}
	public Page2 getSelect() {
		 select=new Page2(driver);
		 return select;
	}
	public Page3 getBook() {
		 book=new Page3(driver);
return book;
	}
	public Page4 getconfirm() {
		 confirm=new Page4(driver);
return confirm;
	}
	
	

}
