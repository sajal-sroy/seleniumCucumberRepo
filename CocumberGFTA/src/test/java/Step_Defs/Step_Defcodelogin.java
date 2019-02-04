package Step_Defs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defcodelogin {
  WebDriver driver;
@Given("^Open Chrome and start the application$")
public void open_Chrome_and_start_the_application() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\SajalData\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://localhost:9002/testmeapp/login.htm");
	   driver.manage().window().maximize();
	   
 
}

@When("^user enter valid userid and password$")
public void user_enter_valid_userid_and_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 driver.findElement(By.name("userName")).sendKeys("lalitha");
 driver.findElement(By.name("password")).sendKeys("password123");
 driver.findElement(By.name("Login")).click();
 
}

@Then("^user should able to login$")
public void user_should_able_to_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.close();
}
}
