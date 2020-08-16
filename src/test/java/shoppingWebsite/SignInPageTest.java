package shoppingWebsite;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;

import com.AutomationPractice.qa.base.TestBase;
import com.AutomationPractice.qa.pages.HomePage;
import com.AutomationPractice.qa.pages.MyAccountPage;
import com.AutomationPractice.qa.pages.SignInPage;
import com.AutomationPractice.qa.util.TestUtility;

public class SignInPageTest extends TestBase {
	SignInPage objSignInPage;
	MyAccountPage objMyAccountPage;
	HomePage objHomePage;
	
	public  SignInPageTest() {
		super();
	    }
	
	@BeforeTest
	void setUp() {
		
		objSignInPage = new SignInPage();
		objMyAccountPage = new MyAccountPage ();
		objHomePage = new HomePage ();
		intialization();
		objHomePage.navigateToSignInPage();
		driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
}
