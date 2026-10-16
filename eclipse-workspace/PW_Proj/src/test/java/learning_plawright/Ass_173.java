package learning_plawright;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ass_173 extends ListenerLogic {
	
	@DataProvider
	public Object[][] loginData(){
		return new Object[][] {
			{"rohini.s.date94@gmail.com" , "123456"},
			{"8208879596" , "123456"},
			{"rohini.s.date94@gmail.com" , "@123"},
			{"rohini.s.date" , "@123"},
			{"" , ""},
		};
		
	}
			
@Test(dataProvider ="loginData" )
public void AmazonLogin(String un, String pass) {
	Playwright playwright =  Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page = browser.newPage();
	page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	page.locator("#ap_email_login").fill(un);
	page.locator("#continue").click();
	page.locator("xpath=//div/input[@type='password']").fill(pass);
	page.locator("#signInSubmit").click();
	boolean title = page.title().contains(un);
	page.waitForTimeout(3000);
	page.getByText("Account & Lists").hover();
	page.getByText("Sign Out").click();
	page.waitForTimeout(3000);
	Locator msg = page.getByText("Sign in or create account");
	
	
}
	
	
}
