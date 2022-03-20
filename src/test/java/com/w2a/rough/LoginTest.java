package com.w2a.rough;




import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;


public class LoginTest {

	public static void main(String[] args) {
		// Using EGit Plugin
	
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("momome5653@gmail.com", "moath5653");
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("moath");
		
		//driver.manage.window.maximze()
		
	}

}