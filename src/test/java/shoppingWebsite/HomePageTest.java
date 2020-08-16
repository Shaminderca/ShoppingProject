package shoppingWebsite;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AutomationPractice.qa.base.TestBase;
import com.AutomationPractice.qa.pages.HomePage;
import com.AutomationPractice.qa.pages.SignInPage;

public class HomePageTest extends TestBase{
	SignInPage objSignInPage;
	HomePage objHomePage;

	public HomePageTest() {
	super();
    }
	@BeforeTest
	void setUp() {
		intialization();
		objSignInPage = new SignInPage();
		objHomePage = new HomePage ();
	}
	@Test(priority=1)
	public void verifyLogoTest() {
		
		Assert.assertTrue(objHomePage.verifyLogo(),"Home Page Icon Not Found");
		
	}
	
	@Test(priority=2)
	public void getHomePageTitleTest() {
		Assert.assertEquals(objHomePage.getHomePageTitle(), "My Store");
	}
	
	@Test(priority=3)
	public void navigateToSignInPageTest()
	{
		objHomePage.navigateToSignInPage();
		String signInPageTitle=driver.getTitle();
		Assert.assertEquals(signInPageTitle, "Login - My Store");
	}
	
	@AfterTest()
	void tearDown()
	{
		driver.quit();
	}
	
}
