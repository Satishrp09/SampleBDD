package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoStepDef {
	WebDriver driver = Base.setUpBeforeTestCase();
	
	@Given("^User launches Application$")
	public void user_launches_Application() throws Exception {
		driver.get("https://www.facebook.com/");
		
	}

	@When("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String email, String pwd) throws Exception {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^application should throw an error$")
	public void application_should_throw_an_error() throws Exception {
		System.out.println("Title is "+driver.getTitle());
	}

}
