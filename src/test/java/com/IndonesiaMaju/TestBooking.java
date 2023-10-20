package com.IndonesiaMaju;

import com.IndonesiaMaju.pages.BookingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestBooking {

    static WebDriver driver;
    static ExtentTest extentTest;
    static BookingPage booking = new BookingPage();

    public TestBooking(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User pilih tanggal")
    public void User_pilih_tanggal(){
        booking.pilihTanggal("2022-12-10");
        extentTest.log(LogStatus.PASS,"User pilih tanggal");
    }
    @And("User pilih waktu")
    public void User_pilih_waktu(){
        booking.pilihWaktu("09:00:00 - 11:00:00");
        extentTest.log(LogStatus.PASS,"User pilih waktu");
    }
    @And("User memasukan nominal stor")
    public void User_memasukan_nominal_stor(){
        booking.nominalStor("1000000");
        extentTest.log(LogStatus.PASS,"User memasukan nominal stor");
    }
    @And("User click button save")
    public void User_click_button_save(){
        booking.clickSave();
        extentTest.log(LogStatus.PASS,"User click button save");
    }
    @Then("User get text valid data")
    public void User_get_text_valid_data() {
        Hooks.delay(1);
        Assert.assertEquals(booking.getTextvalid(), "Berhasil tambah data");
        extentTest.log(LogStatus.PASS, "User get text valid data");
    }
    @And("User memasukan nominal stor yang tidak sesuai")
    public void User_memasukan_nominal_stor_yang_tidak_sesuai(){
        booking.nominalStor("1200000");
        extentTest.log(LogStatus.PASS, "User memasukan nominal stor yang tidak sesuai");
        delay(3);
    }
    @Then("User get text Invalid stor")
    public void User_get_text_Invalid_stor() {
        Hooks.delay(1);
        Assert.assertEquals(booking.getTextInvalidStor(), "Nominal stor tidak sesuai dengan daftar stor");
        extentTest.log(LogStatus.PASS, "User get text Invalid stor");
    }
    @Then("User get text Invalid data double")
    public void User_get_text_Invalid_data_double() {
        Hooks.delay(1);
        Assert.assertEquals(booking.getTextInvalidDouble(), "Tanggal dan waktu yang dipesan sudah penuh");
        extentTest.log(LogStatus.PASS, "User get text Invalid data double");
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void scroll(int pixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixel+")"); //scroll down vertikal 500px
    }
}
