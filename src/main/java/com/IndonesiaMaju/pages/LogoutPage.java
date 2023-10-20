package com.IndonesiaMaju.pages;

import com.IndonesiaMaju.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    private WebDriver driver;
    public LogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "xpath icon logout")
    WebElement btnIcon;
    @FindBy(xpath = "xpath button logout")
    WebElement btnLogout;
    @FindBy(xpath = "xpath text dashboard")
    WebElement txtDashboard;


    public void clickIcon(){
        btnIcon.click();
    }
    public void clickLogout(){
        btnLogout.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
}
