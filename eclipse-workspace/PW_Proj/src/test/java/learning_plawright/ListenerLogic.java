package learning_plawright;

import java.nio.file.Paths;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ListenerLogic implements ITestListener{
	 public static  Playwright playwright;
     public static Browser browser;
     public static BrowserContext browsercontext;
     public static Page page;

     @Override
     public void onTestSuccess(ITestResult result) {
             // TODO Auto-generated method stub
             ITestListener.super.onTestSuccess(result);
             //Logic should start from here
     page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\DELL\\eclipse-workspace\\PW_Proj\\test-output\\Screenshots\\Pass\\Pass.png")));

System.out.println("SS taken");

     }
     

     @Override
     public void onTestFailure(ITestResult result) {
             // TODO Auto-generated method stub
             ITestListener.super.onTestFailure(result);
             //Logic should start from here
     page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\DELL\\eclipse-workspace\\PW_Proj\\test-output\\Screenshots\\Fail\\Fail.png")));


     }
}
