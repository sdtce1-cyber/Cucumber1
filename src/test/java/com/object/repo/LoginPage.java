
package com.object.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    public WebElement getUserName() {
        return userName;
    }
    @FindBys({ 
    @FindBy(xpath = "(//div[@class=\"oxd-input-group__label-wrapper\"])[2]"),
    @FindBy(xpath = "//input[@name='password']"),
    })
    private WebElement passWord;

    public WebElement getPassWord() {
        return passWord;
    }
    @FindAll ( {
    	@FindBy(xpath = "//button[@type='submit']"),
    	@FindBy(xpath = "//button[@classoxd-button oxd-button-"
    			+ "-medium oxd-button--main orangehrm-login-button\"])")
    })
    
    private WebElement Submit;

    public WebElement getSubmit() {
        return Submit;
    }
}
