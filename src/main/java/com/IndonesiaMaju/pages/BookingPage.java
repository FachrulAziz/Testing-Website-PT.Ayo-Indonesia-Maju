package com.IndonesiaMaju.pages;

import com.IndonesiaMaju.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    private WebDriver driver;
    public BookingPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "xpath tanggal")
    WebElement inputTanggal;
    @FindBy(xpath = "xpath waktu")
    WebElement inputWaktu;
    @FindBy(xpath = "xpath stor")
    WebElement inputStor;
    @FindBy(xpath = "xpath button save")
    WebElement clickS;
    @FindBy(xpath = "xpath dashboard")
    WebElement getValid;
    @FindBy(xpath = "xpath invalid stor")
    WebElement getInvalidStor;
    @FindBy(xpath = "xpath invalid double")
    WebElement getInvalidDouble;

    public void pilihTanggal(String tanggal){
        this.inputTanggal.sendKeys(tanggal);
    }
    public void pilihWaktu(String waktu){
        this.inputWaktu.sendKeys(waktu);
    }
    public void nominalStor(String stor){
        this.inputStor.sendKeys(stor);
    }
    public void clickSave(){
        clickS.click();
    }
    public  String getTextvalid(){
        return getValid.getText();
    }
    public  String getTextInvalidStor(){
        return getInvalidStor.getText();
    }
    public  String getTextInvalidDouble(){
        return getInvalidDouble.getText();
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
