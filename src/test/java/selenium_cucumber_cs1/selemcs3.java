package selenium_cucumber_cs1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class selemcs3 {
WebDriver driver=null;
@Given("home page arrived")
public void home_page_arrived() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
 driver.manage().window().maximize();

}

@When("click on sign in button")
public void click_on_sign_in_button() {
 driver.findElement(By.linkText("SignIn")).click();

}

@When("enter the username as {string}")
public void enter_the_username_as(String string) {
   driver.findElement(By.name("userName")).sendKeys("lalitha");
}

@When("enter the password as {string}{int}")
public void enter_the_password_as(String string, Integer int1) {
   
driver.findElement(By.name("password")).sendKeys("password123");
driver.findElement(By.name("Login")).click();
}

@When("page will directed to loginpage")
public void page_will_directed_to_loginpage() {
 System.out.println("the page loded is"+driver.getTitle());
   
}

@When("search for any item with min of four letters")
public void search_for_any_item_with_min_of_four_letters() throws InterruptedException {
 driver.findElement(By.name("products")).click();
 driver.findElement(By.name("products")).sendKeys("head");
 //driver.findElement(By.name("products")).sendKeys("e");
//driver.findElement(By.name("products")).sendKeys("a");
//driver.findElement(By.name("products")).sendKeys("d");
 Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
 //Actions a2=new Actions(driver);
//a2.sendKeys(Keys.ARROW_DOWN).click();
}
@When("drop drown list appeared and choose product")
public void drop_drown_list_appeared_and_choose_product() {
 //driver.findElement(By.name("products")).click();
 //Actions a1=new Actions(driver);
 //a1.sendKeys(Keys.ARROW_DOWN).click();
 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
 
 
   
}

@Then("page will directed to payment portal")
public void page_will_directed_to_payment_portal() {
 System.out.println("the page directed is"+driver.getTitle());
   
}

}