package com.nttdata.steps;

import com.nttdata.screens.MainScreen;
import com.nttdata.screens.SubMainScreen;
import org.junit.Assert;

public class ExamenSteps {
    MainScreen MainScreen;
    SubMainScreen subMainScreen;
    public void selectProductBackpack(){
        MainScreen.clickBackpack();

    }

    public void verifyProducts() {
        Assert.assertTrue("Los productos estan cargados", subMainScreen.isProductDisplayedExamen());
    }
    public void selectProductTshirt(){
        MainScreen.clickTShirt();
    }
    public void selectProductSauceLight(){
        MainScreen.clickSauceLight();
    }
    public void selectAddProduct(){
        MainScreen.clickAddProduct();
    }
    public void selectIncrementar(){
        MainScreen.clickIncreaseQuantity();
    }
    public void verifyCar() {
       Assert.assertTrue("Los productos estan cargados", subMainScreen.isBtnCheckoutDisplayed());
    }
}
