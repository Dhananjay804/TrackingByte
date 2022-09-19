package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionforfeature {
public static WebDriver driver;
@Given("open browser and enter url")
public void open_browser_and_enter_url() {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@Then("login page should be displayed")
public void login_page_should_be_displayed() {
    String title=driver.getTitle();
    Assert.assertEquals(title, "Facebook – log in or sign up");
}

@When("enter valid username, valid password")
public void enter_valid_username_valid_password() throws InterruptedException {
    driver.findElement(By.id("email")).sendKeys("admin");
    Thread.sleep(2000);
    driver.findElement(By.id("pass")).sendKeys("admin@123");
}

@And("click on login button")
public void click_on_login_button() throws InterruptedException {
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
}

@Then("Home page should be displayed.")
public void home_page_should_be_displayed() {
   String hometitle=driver.getTitle();
   Assert.assertEquals(hometitle, "Facebook Home page");
}

	}

