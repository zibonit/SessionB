package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPages {
	
	WebDriver driver;
	
	public loginPages (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
				
	}
	@FindBy(id="email")
	WebElement usernamebx;
	
	public void getUsernameBx(String user) {
		
		usernamebx.sendKeys(user);
	}
	
	@FindBy(id="pass")
	
	WebElement passwordBx;
	
	public void getpasswordBx(String pass) {
		
		passwordBx.sendKeys(pass);
	}
	@FindBy(name="login")
	WebElement loginbtn;
	
	public void getloginbtn() {
		loginbtn.click();
	}
	//@FindBy(aria-label="Search Facebook")
	//WebElement Search1;
	
	//public void Search() {
	//	Search1.click();
		
		
	//}
	
	//@FindBy()
	//WebElement Search;
	
	//public void Search() {
	//	Search1.click();
//	}

}

