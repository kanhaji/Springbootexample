package com.casestudy.pillar.casestudy.CustomException;

public class UnableToGenerateDataException extends Exception{

	public String objectType;
	
	public UnableToGenerateDataException(String ObjectType) {	
	super("Unable to randomly generate entity : "+ObjectType);
	this.objectType=ObjectType;
	}
	
}
