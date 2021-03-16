package com.configuration.helper;

public class FileReaderManager {
	public static FileReaderManager getInstance() {
		
		FileReaderManager manager=new FileReaderManager();
		return manager;
	}
	
public  ConfigurationReader getIntanceCR() throws Throwable {
	ConfigurationReader reader=new ConfigurationReader();
	return reader;
	
	

}
	
}
