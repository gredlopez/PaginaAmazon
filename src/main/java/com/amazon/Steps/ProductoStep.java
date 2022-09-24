package com.amazon.Steps;

import com.amazon.Model.EsperaImplicita;
import com.amazon.Model.Scroll;
import com.amazon.PageObject.ProductoPageObject;
import net.thucydides.core.annotations.Step;

public class ProductoStep {

    ProductoPageObject productoPageObject = new ProductoPageObject();
    Scroll scroll= new Scroll();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void productodeLaPestaña2() {
        scroll.scrollElemento(productoPageObject.getDriver(), productoPageObject.getLnbProducto3());
        esperaImplicita.esperaimplicita(20);
        productoPageObject.getDriver().findElement(productoPageObject.getLnbProducto3()).click();

    }

    @Step
    public void clicEnElBotonCarroCompra(){
        productoPageObject.getDriver().findElement(productoPageObject.getBtnCarroDeCompra()).click();
    }

    @Step
    public void clicEnElBotonCarroCompraError(){
        productoPageObject.getDriver().findElement(productoPageObject.getBtnCarroDeCompraError()).click();
    }

    }
