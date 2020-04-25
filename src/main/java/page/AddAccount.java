package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddAccount {
	WebDriver driver;
	
	public AddAccount(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library for adding new account 
	@FindBy(how=How.ID, using ="account")
	WebElement Accounttitle_field;	
	@FindBy(how=How.ID, using ="description")
	WebElement Description_field;
	@FindBy(how=How.ID, using = "balance")
	WebElement Balance_field;
	@FindBy(how=How.XPATH, using ="//button[@class='btn btn-primary']")
	WebElement Submit_Button;
	
	@FindBy(how=How.XPATH, using ="//div[@class='alert alert-success fade in']")
	WebElement successe_message;
	
	//Method to fill out the new account 
	public void fillOutNewAccount(String accountTitle, String description, String balance) {
		Accounttitle_field.sendKeys(accountTitle);
		Description_field.sendKeys(description);
		Balance_field.sendKeys(balance);
		Submit_Button.click();
	}
	//verify account is created suceessfully
	public void verifyAccountcreatedsuccessfully() {
		Assert.assertTrue(successe_message.isDisplayed());
	}
}

