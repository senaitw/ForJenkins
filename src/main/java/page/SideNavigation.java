package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {

	WebDriver driver;
	public SideNavigation(WebDriver driver) {
		this.driver = driver;
		}
	@FindBy(how=How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankCashModel;
	@FindBy(how=How.XPATH, using ="//a[text()='New Account']")
	WebElement newAccount;

	public void goToBankCash() throws InterruptedException{
		BankCashModel.click();
		Thread.sleep(2000);
		newAccount.click();
	}
	
}
