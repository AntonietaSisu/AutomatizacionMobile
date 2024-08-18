package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SubMainScreen extends PageObject {

    private WebDriver driver;

    public SubMainScreen(WebDriver driver) {
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement lblProduct;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btncheckuot;
    public boolean isProductDisplayedExamen(){
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));
       // wait.until(ExpectedConditions.visibilityOf(lblProduct));

      //  return lblProduct.isEnabled();
       waitFor(ExpectedConditions.visibilityOf(lblProduct));
       return lblProduct.isEnabled();
    }
    public boolean isBtnCheckoutDisplayed(){

        waitFor(ExpectedConditions.visibilityOf(btncheckuot));
        return btncheckuot.isEnabled();
    }
}
