package stepDefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Seleniumstep {
	
static	WebDriver driver;
	
	

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

      
        driver = new ChromeDriver();
     
       
	}
	

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		   driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
	}

	

@And("^Customer enters UserName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void customer_enters_UserName_as_and_Password_as(String arg1, String arg2) throws Throwable {
	driver.findElement(By.id("user_login")).sendKeys(arg1);
	driver.findElement(By.id("user_pass")).sendKeys(arg2);
	driver.findElement(By.id("wp-submit")).click();
	
}
	
	/*
	 * @When("^I enter following for login$") public void
	 * i_enter_following_for_login(DataTable table) throws Throwable {
	 * 
	 * 
	 * List<List<String>> data =table.raw();
	 * 
	 * // Write code here that turns the phrase above into concrete actions
	 * 
	 * 
	 * //Create ArrayList List<User>users=new ArrayList<User>(); users=
	 * table.asList(User.class);
	 * 
	 * for(User user:users) {
	 * 
	 * driver.findElement(By.id("user_login")).sendKeys(user.username);
	 * driver.findElement(By.id("user_pass")).sendKeys(user.password);
	 * driver.findElement(By.id("wp-submit")).click(); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public class User {
	 * 
	 * public String username; public String password;
	 * 
	 * 
	 * 
	 * 
	 * public User(String userName, String passWord) {
	 * 
	 * username = userName; password = passWord; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */


	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {

		System.out.println("Login Successfully");
		
	driver.close();
	driver.quit();
	
	
			
		}
		
}

	
	
	

