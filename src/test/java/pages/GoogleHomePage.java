package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	private By txt_search = By.name("q");
	protected WebDriver driver=null;
	private String url="https://www.google.com/";
	
	
	public GoogleHomePage(WebDriver driver) {
		super();
		this.driver = driver;
		driver.get(url);
	}

	public void searchByText(String texte) {
		WebElement searchText = driver.findElement(txt_search);
		searchText.sendKeys(texte);
		searchText.sendKeys(Keys.ENTER);
	}

}
