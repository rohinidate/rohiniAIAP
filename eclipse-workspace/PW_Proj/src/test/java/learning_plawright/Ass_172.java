package learning_plawright;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Ass_172 {
@DataProvider
public Object[][] searchData_data1() {
	
	return new Object[][]{
		{"shoe"},
		{"mobile"},
		{"toy"},
        {"book"}
	};
}

@Test(dataProvider="searchData_data1")
public void searchAmazonProduct(String value) {
	Playwright playwright= Playwright.create();
   Browser browser=        playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
   Page page=                browser.newPage();
   
   page.navigate("https://www.amazon.in/");
  Locator l1= page.getByRole(AriaRole.SEARCHBOX);
  l1.fill(value);
  l1.press("Enter");
  page.waitForTimeout(3000);
  boolean title = page.title().contains(value);
  System.out.println(title);
}
}
