package learning_plawright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import junit.framework.Assert;

public class AmazonSearch extends ListenerLogic {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D815461296140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6219535317592849043%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062047%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2462829%26mcid%3De9c68a2d0f333bcaacd29ec00843c329%26hvocijid%3D6219535317592849043--%26hvexpln%3Dnav%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		page.locator("//input[@type='text']").                                                                        fill("8208879596");
//		page.locator("//input[@type='submit']").click();
//		page.locator("//input[@type='password']").                                                                    fill("8208879596");
//		page.locator("//input[@id='signInSubmit']").click();
//		Locator l1 =page.getByLabel("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
//Assert.assertEquals(true, l1);
	}

}
