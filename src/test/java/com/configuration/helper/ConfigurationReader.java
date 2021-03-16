package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class ConfigurationReader {
	public static Properties p;
  public ConfigurationReader() throws Throwable {
File f=new File("C:\\Users\\hp\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
FileInputStream fis=new FileInputStream(f);
 p=new Properties();
p.load(fis);

}
  public static String getBrowser() {
	String browser = p.getProperty("browser");
return browser;
}
  public  String getUrl() {
	String url = p.getProperty("url");
	return url;
  }
 public  String getUserName() {
	  String userName = p.getProperty("db_UserName");
		return userName;

}
 public  String getPassword() {
	  String Password = p.getProperty("db_Password");
		return Password;

}
 public  String getCreditCardNumber() {
	  String creditcardnumber = p.getProperty("db_CreditCardNumber");
		return creditcardnumber;

}
 public  String getCVVNumber() {
	  String CVVNumber = p.getProperty("db_CVVNumber");
		return CVVNumber;

}
}

