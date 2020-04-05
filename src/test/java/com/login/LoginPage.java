package com.login;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.Baseclass;



public class LoginPage extends Baseclass {

public LoginPage() {
PageFactory.initElements(driver, this);	
	}
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(xpath="//input[@value='Log In']")
private WebElement btnogin;
public WebElement getUsername() {
	return username;
}
public void setUsername(WebElement username) {
	this.username = username;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
public WebElement btnogin() {
	return btnogin;
}
public void setLstbtnogin(WebElement btnogin) {
	this.btnogin = btnogin;
}



}
