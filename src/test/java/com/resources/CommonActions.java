package com.resources;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
	public static WebDriver driver;

	   public void search(WebElement search, String value) {
		   search.sendKeys(value,Keys.ENTER);
		   
	}

}
