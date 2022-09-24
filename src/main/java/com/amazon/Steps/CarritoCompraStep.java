package com.amazon.Steps;

import com.amazon.PageObject.CarritoCompraPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import com.amazon.PageObject.PaginaPrincipalPageObjects;

public class CarritoCompraStep {

    CarritoCompraPageObject carritoCompraPageObject = new CarritoCompraPageObject();
    PaginaPrincipalPageObjects paginaPrincipalPageObjects = new PaginaPrincipalPageObjects();

    @Step
    public void BotonparaAgregarAlCarritoCompra (){
        carritoCompraPageObject.getDriver().findElement(carritoCompraPageObject.getBtnAgregarCarrito()).click();
    }

    @Step
    public void BotonCarrito (){
        carritoCompraPageObject.getDriver().findElement(carritoCompraPageObject.getBtnCarrito()).click();


        //@Step
        //public void ValidarCuentaIniciada() {
          //  Assert.assertThat(paginaPrincipalPageObjects.getDriver().
            //        findElement(paginaPrincipalPageObjects.getBtnValidacionCarrito()).isDisplayed(), Matchers.is(true));
        //}

    }

}
