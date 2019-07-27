package selenium_cucumber_cs1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class selemcs2 {
	WebDriver driver=null;
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		   
	   
	}

	@When("User click on to signin link")
	public void user_click_on_to_signin_link() {
		driver.findElement(By.name("SignIn")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		 driver.findElement(By.name("userName")).click();
		 driver.findElement(By.name("userName")).sendKeys(string);
		 driver.findElement(By.name("password")).click();
		 driver.findElement(By.name("password")).sendKeys(string2);
		 driver.findElement(By.name("Login")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		 driver.close();
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("Login successful");
	    
	}


}
