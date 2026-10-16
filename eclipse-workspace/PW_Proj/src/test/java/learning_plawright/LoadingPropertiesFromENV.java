package learning_plawright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.github.cdimascio.dotenv.Dotenv;

public class LoadingPropertiesFromENV {
	Playwright playwright;
    Browser browser;
    BrowserContext browsercontext;
    Page page;
    @Test
	public void Login() {
		
		Dotenv env = Dotenv.load();
		String url = env.get("url");
		String un = env.get("my_username");
		String pass = env.get("my_password");
		
		
		playwright=                        Playwright.create();
	    browser=        playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    browsercontext=        browser.newContext();
	    page=        browsercontext.newPage();
		page.navigate(url);
	    page.reload();
	    page.locator("#ap_email_login").fill(un);
	    page.locator("#continue").click();
	    page.locator("#ap_password").fill(pass);
	    page.locator("#signInSubmit").click();
	}
	
    
}
