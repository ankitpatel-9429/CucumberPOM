package com.qa.StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	@Before
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		
	}

	@After
	public void tearDown() {
		driver.quit();

	}

	@Given("^verify login page title$")
	public void verify_login_page_title() throws Throwable {

		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("Here's the amazing journey that you've had with Flipkart", title);

	}

	@Then("^verify login page logo$")
	public void verify_login_page_logo() {
		boolean flag;
		flag = loginPage.validateLogo();
		Assert.assertTrue(flag);

	}

	@Then("^logged in using username and password$")
	public void logged_in_using_username_and_password() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}


	///////////////////////////////

	@Given("^verify homepage username title$")
	public void verify_homepage_username_title() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean flag = homePage.verifyUserName();
		Assert.assertTrue(flag);

	}

	@Then("^verify more manue options$")
	public void verify_more_manue_options() throws Throwable {

		List<WebElement> moreOptions = homePage.verifyMoreOptions();
		Assert.assertEquals(5, moreOptions.size());

	}

}
