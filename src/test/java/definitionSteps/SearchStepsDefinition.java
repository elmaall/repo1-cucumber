package definitionSteps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleHomePage;

public class SearchStepsDefinition {
	
	WebDriver driver =null;
	String baseUrl = "";
	GoogleHomePage googlePage;
	
	
	@Given("i am in google page search")
	public void i_am_in_google_page_search() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/melmaallem/tools/eclipse-workspace/workspace-selenium/cucumber/src/test/resources/webDriver/chromedriver_win32/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	}

	@When("i enter cucumber")
	public void i_enter_cucumber() {
		googlePage=new GoogleHomePage(driver);
		googlePage.searchByText("cucumber");
	}

	@Then("i move to page contains Cucumber: BDD Testing")
	public void i_move_to_page_contains_cucumber_bdd_testing() {
	  assertTrue( driver.getPageSource().contains("Cucumber: BDD Testing"));
	  driver.quit();
	}

}
