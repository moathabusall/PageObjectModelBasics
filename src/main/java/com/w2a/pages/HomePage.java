package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;


public class HomePage extends Page {
	
	
	public void goToSupport(){
		
		driver.findElement(By.cssSelector("body > div.main-container-wrapper > div.zh-header-wrap > div > a.zh-support")).click();
		
	}
	
	public void goToSignUp(){
		
		driver.findElement(By.cssSelector("body > div.main-container-wrapper > div.zh-header-wrap > div > a.zh-signup")).click();
	}
	
	
	public LoginPage goToLogin(){
		
		click("loginlink_CSS");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu(){
		
		
		
	}
	
	public void goToLearnMore(){
		
		
		
	}
	
	
	public void validateFooterLinks(){
		
		
	}
}
