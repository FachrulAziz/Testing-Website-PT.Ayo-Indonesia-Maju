package com.IndonesiaMaju;

import com.IndonesiaMaju.pages.LogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogout {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LogoutPage logoutPage = new LogoutPage();

    public TestLogout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("user click icon logout")
    public void user_click_icon_logout(){
        logoutPage.clickIcon();
        extentTest.log(LogStatus.PASS,"user click icon logout");
    }

    @And("user click button logout")
    public void user_click_button_logout(){
        logoutPage.clickLogout();
        extentTest.log(LogStatus.PASS,"user click button logout");
    }

    @Then("user get text title page")
    public void user_get_text_title_page(){
        Hooks.delay(2);
        Assert.assertEquals(logoutPage.getTxtDashboard(),"Welcome Back");
        extentTest.log(LogStatus.PASS,"user get text title page");
    }
}
