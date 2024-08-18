package com.nttdata.stepsDefinitions;

import com.nttdata.steps.ExamenSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ExamenStepsDefs {
    @Steps
    ExamenSteps examenSteps;

    @Given("que estoy en la aplicación de SauceLabs")
    public void queEstoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que los productos carguen correctamente en la galería")
    public void validoQueLosProductosCarguenCorrectamenteEnLaGalería() {
        examenSteps.verifyProducts();
    }

    @When("agrego {string} del producto {string}")
    public void agregoDelProducto(String unidades, String producto) {

        int cantidad = Integer.parseInt(unidades);
        if(producto == "Sauce Labs Backpack"){
            examenSteps.selectProductBackpack();
            examenSteps.selectAddProduct();
        }
        if(producto == "Sauce Labs Bolt T-Shirt"){
            examenSteps.selectProductTshirt();
            examenSteps.selectAddProduct();
        }
        if(producto == "Sauce Labs Bike Light"){
            examenSteps.selectProductSauceLight();
            examenSteps.selectIncrementar();
            examenSteps.selectAddProduct();
        }


    }

    @Then("valido que el carrito de compra se actualice correctamente")
    public void validoQueElCarritoDeCompraSeActualiceCorrectamente() {
        examenSteps.verifyCar();
    }
}
