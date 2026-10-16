package learning_plawright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class launchBrowser {
public static void main(String[] args) {
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page = browser.newPage();
	page.navigate("https://www.facebook.com");
	page.getByRole(AriaRole.TEXTBOX,new Page.GetByRoleOptions().setName("Email address or mobile number") )
	                                                                                                                     .fill("rohinija34@gmail.com");
	page.locator("//div/input[@type='password']").                                                                      fill("Rohini@123");
    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).press("Enter");
	
	
}
}
