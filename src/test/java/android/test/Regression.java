package android.test;

import android.pages.HomePage;
import android.pages.LoginPage;
import android.pages.ManageTransfersPage;
import android.pages.ProductPage;
import com.pnt.mobileautomation.ExtentTestManager;
import com.pnt.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Regression extends TestBase {


    @Test(enabled = true)
    public void validateUserCanClickOnAccountsButton() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToClickBetweenButtonsFromHeader() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);


        homePage.clickOnAccountsButton();
        loginPage.clickOnBackButton();
        homePage.clickOnDepositButton();
        loginPage.clickOnBackButton();
        homePage.clickOnPayAbillButton();
        loginPage.clickOnBackButton();
    }
    @Test(enabled = true)
    public void UserBeingAbleToProvideUserNameAndPassword() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ManageTransfersPage manageTransfersPage = PageFactory.initElements(getDriver(), ManageTransfersPage.class);

        homePage.clickOnManageTransfersButton();
        sleepFor(5);
        manageTransfersPage.ProvideUserName();
        sleepFor(5);
        manageTransfersPage.ProvidePassword();
        sleepFor(5);
    }
    @Test
    public void validateUserBeingAbleToScrollOnProductPage() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ProductPage productPage = PageFactory.initElements(getDriver(), ProductPage.class);

        homePage.clickOnProducts();
        productPage.userOnProductPage();
        functionSwipe("up", 200, 500);
        ExtentTestManager.log("swiped down");
        sleepFor(2);
        functionSwipe("up", 200, 500);
        sleepFor(2);
        ExtentTestManager.captureScreenshot(getDriver(), "validateUserBeingAbleToScrollOnProductPage.png");
    }
    @Test
    public void validateUserBeingAbleToClickOnSavingsMoneyMarketAccountsButtonOnProductPage(){
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ProductPage productPage = PageFactory.initElements(getDriver(), ProductPage.class);
        productPage.ClickOnSavingsMoneyMarketAccountsButton();

    }

}
