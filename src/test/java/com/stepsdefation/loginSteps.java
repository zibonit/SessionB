package com.stepsdefation;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.loginBase;
import com.pageobjectmodel.loginPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends loginBase  {
	
	loginPages page;
	
	@Given("User on Swaglab homepage")
	public void user_on_swaglab_homepage() {
	   getDriver();
	    
	   page = new loginPages(driver);
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String user) throws InterruptedException {
		
		page.getUsernameBx(user);
	   
		//Thread.sleep(3000);
		
	   // driver.findElement(By.id("user-name")).sendKeys(user);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as_secret_sauce(String pass) throws InterruptedException {
		
	   page.getpasswordBx(pass);
	   //Thread.sleep(3000);
	    //driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("user clicks o Login buttom")
	public void user_clicks_o_login_buttom() throws InterruptedException {
		
		page.getloginbtn();
		//Thread.sleep(3000);
	   
	  // page.getclickBx(click);
		//driver.findElement(By.id("login-button")).click();
	}
	
	@When("Click Search")
	 public void click_search() {
		page.
	}
	
	@Then("enter name")
	public void enter_name() {
		page.Search();
	}

	@Then("User verifies the landing page")
	public void user_verifies_the_landing_page() {
	   
	   Assert.assertEquals(driver.getTitle(), "Swag Labs"); 
	   closeDriver();
	}

}
