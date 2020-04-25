package test;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddAccount;
import page.SideNavigation;
import page.loginPage;
import util.BroweserFactory;

public class LoginTest {

	
	
	WebDriver driver;
	@Test (priority=1)
	@Parameters({"UserName", "Password","accountTitle","description", "balance"})
	public void validuserShouldLogin(String UserName, String Password, String accountTitle,String description, String balance) throws InterruptedException {
		driver= BroweserFactory.startBroweser();
	loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.login(UserName, Password);
	SideNavigation sideNavigation =PageFactory.initElements(driver, SideNavigation.class);
		Thread.sleep(2000);
		sideNavigation.goToBankCash();
	
		Random rnd = new Random();	
	String expectedtitle = accountTitle + rnd.nextInt(999);	
			
		AddAccount addAccount = PageFactory.initElements(driver, AddAccount.class);
		addAccount.fillOutNewAccount(expectedtitle, description, balance);
}
}