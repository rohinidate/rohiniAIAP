package learning_plawright;



import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

@Listeners(ListenerLogic.class)
public class AmazonSignIn extends ListenerLogic{
	@Parameters("engine")
	@Test
	public void gmailClick() {
		 playwright= Playwright.create();
         browser=        playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         page=                browser.newPage();
        
        page.navigate("https://www.google.com/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Gmail")).click();
  
       // browser.close();
	}
	
	@Test
	public void gmailClickfail() {
		 playwright= Playwright.create();
         browser=        playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         page=                browser.newPage();
        
        page.navigate("https://www.google.com/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Gmail1")).click();
  
       // browser.close();
	}
}
