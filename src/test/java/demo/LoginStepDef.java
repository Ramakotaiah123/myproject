package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	
	
	@Given("user lunching application")
	public void user_lunching_app() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_unzip32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@When("user enter {string} and {string} and click")
	public void user_enter_details(String username,String password) {
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	
	
	
	}
	@Then("user should be navigated to home page")
	public void navigated_To_home() {
		
		System.out.println("i am in then");
	}
	
	

}