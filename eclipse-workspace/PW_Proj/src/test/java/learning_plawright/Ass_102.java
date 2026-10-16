package learning_plawright;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ass_102 extends ListenerLogic {
	@Test
public void learningFile() {
		Playwright playwright = Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("file:///C:/Users/DELL/Downloads/learningHTML1.html");
		page.waitForTimeout(3000);
		page.locator("xpath=(/html/body/input)[1]").fill("Rohini");
		page.locator("xpath=(/html/body/input)[3]").fill("Rohini123");
		page.locator("xpath=(/html/body/form/input)[1]").fill("Rohini");
		page.locator("xpath=((/html/body/form)[2]/input)[1]").click();
		page.locator("xpath=(/html/body/input)[5]").click();
		page.waitForTimeout(2000);
		
}

}
