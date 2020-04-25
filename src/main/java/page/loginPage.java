package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

		WebDriver driver;
		
		public void loginPage(WebDriver driver) {
			this.driver = driver;
		}
		@FindBy(how=How.XPATH, using="//input[@id='username']")
		  WebElement UserName_Field;
		  @FindBy(how=How.XPATH, using= "//input[@id='password']")
		  WebElement password_Field;
		  @FindBy(how=How.XPATH, using="//Button[text()='Sign in']")
		  WebElement Submit;
		  
		  public void login(String UserName, String Password) {
			UserName_Field.sendKeys(UserName);
			password_Field.sendKeys(Password);
		  	Submit.click();


}
}