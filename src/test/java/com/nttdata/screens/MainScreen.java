package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class MainScreen {
    private WebDriver driver;

    public MainScreen(WebDriver driver) {
        this.driver = driver;
    }
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnBackpack;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddProduct;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnTShirt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnSauceLight;

    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnIncreaseQuantity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirms products for checkout\"]")
    private WebElement btnConfirmCheckout;

    public Boolean isProductDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));
        wait.until(ExpectedConditions.visibilityOf(lblProduct));

        return lblProduct.isEnabled();
   }
    public Boolean isShoppingCartDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(btnConfirmCheckout));
        return btnConfirmCheckout.isEnabled();
    }
    public void clickBackpack() {
        btnBackpack.click();
    }


    public void clickAddProduct() {btnAddProduct.click();}
    public void clickTShirt() {btnTShirt.click();}
    public void clickSauceLight() {btnSauceLight.click();}
    public void clickIncreaseQuantity() {btnIncreaseQuantity.click();}
}
