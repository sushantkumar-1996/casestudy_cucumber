package selenium_cucumber_cs1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class selcmcs1 {
	WebDriver driver=null; 
	@Given("the Signup page is opened")
	public void the_Signup_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.findElement(By.linkText("SignUp")).click();
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		Random rand=new Random();
		int value=rand.nextInt(9999);
		driver.findElement(By.id("userName")).sendKeys("ssntkr12556"+value);
	    
	}

	@When("user enters Firstname as {string}")
	public void user_enters_Firstname_as(String string) {
		 driver.findElement(By.id("firstName")).sendKeys("s");
	    
	}

	@When("user enters Lastname as {string}")
	public void user_enters_Lastname_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("kumar");
	    
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("hpkkk123");
	    
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String string) {
		 driver.findElement(By.id("pass_confirmation")).sendKeys("hpkkk123");
	    
	}

	@When("user enters gender as {string}")
	public void user_enters_gender_as(String string) {
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		 radio1.click();
	    
	}

	@When("user enters {string} as Email")
	public void user_enters_as_Email(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("1225545666@gmail.com");
	    
	}

	@When("user enters {string} as Mobile Number")
	public void user_enters_as_Mobile_Number(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("1234657899");
	    
	}

	@When("user enters {string} as DOB")
	public void user_enters_as_DOB(String string) {
		driver.findElement(By.name("dob")).sendKeys("05/05/1998");
	    
	}

	@When("user enters {string} as Address")
	public void user_enters_as_Address(String string) {
		driver.findElement(By.id("address")).sendKeys("blhh hhhh");
	    
	}

	@When("user enters the security question and its answer")
	public void user_enters_the_security_question_and_its_answer() throws InterruptedException {
		driver.findElement(By.id("securityQuestion")).click();
		 

		 Thread.sleep(1000);
		 Select sq=new Select(driver.findElement(By.id("securityQuestion")));
		 Random rand = new Random();
		 int value = rand.nextInt(3);
		 sq.selectByIndex(value);
		 Thread.sleep(3000);
		 driver.findElement(By.name("answer")).sendKeys("monkey");
	    
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
	}

	@Then("user registers successfully and finds himself on login page")
	public void user_registers_successfully_and_finds_himself_on_login_page() {
		System.out.println("the title of the page is"+driver.getTitle());
	
	}

}
