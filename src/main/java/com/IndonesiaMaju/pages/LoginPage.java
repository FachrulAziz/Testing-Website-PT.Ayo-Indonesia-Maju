package com.IndonesiaMaju.pages;

import com.IndonesiaMaju.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "xpath username")
    WebElement username;
    @FindBy(xpath = "xpath password")
    WebElement password;
    @FindBy(xpath = "xpath button login")
    WebElement btnLogin;
    @FindBy(xpath = "xpath text dashboard")
    WebElement txtDashboard;
    @FindBy(xpath = "xpath text dashboard invalid")
    WebElement txtInvalidCredentials;
    @FindBy(xpath = "xpath text invalid login")
    WebElement txtInvalidPassword;
    @FindBy(xpath = "xpath button ok")
    WebElement BtnOk;


    public void login(String username, String password){
        this.username.clear();
        this.password.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }


    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
        delay(3);
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }
    public  String getTextInvalidPass(){
        return txtInvalidPassword.getText();
    }
    public void OK(){
        BtnOk.click();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
