package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
public ZohoAppPage doLogin(String username,String password){
	
	//driver.switchTo().frame("zohoiam");

	type("email_CSS",username);
	click("Next_XPATH");
	type("password_CSS",password);	
	click("signbtn_CSS");
	return new ZohoAppPage();
}
	
	public void gotoSalesandMarketing(){
			
	}
	
	public void gotoFinance(){
		
	}
}
