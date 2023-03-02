package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps 
{
	WebDriver driver;
	@Given("Landing on home page")
	public void landing_on_home_page() 
	{
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.get("https://www.demoblaze.com/");
	 driver.manage().window().maximize();
	 
	}

	@When("filter for laptop")
	public void filter_for_laptop() 
	{
	driver.findElement(By.xpath("//div/a[text()='Laptops']")).click();
	driver.findElement(By.xpath("//h4/a[text()='MacBook Pro']")).click();
	}

	@When("Add the laptop to cart")
	public void add_the_laptop_to_cart()
	{
	driver.findElement(By.xpath("//div/a[text()='Add to cart']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.switchTo().alert().accept();
	
	
	}

	@Then("Validating if its added or not")
	public void validating_if_its_added_or_not() 
	{
	driver.findElement(By.xpath("//li/a[text()='Cart']")).click();
	String b = driver.findElement(By.xpath("//tr/td/following-sibling::td[text()='MacBook Pro']")).getText();
	System.out.println(b);
	//Assert.assertEquals("Macbook Pro", b);
	}

	
}
