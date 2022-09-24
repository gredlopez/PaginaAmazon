package com.amazon.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoCompraPageObject extends PageObject {

    By btnAgregarCarrito =By.xpath("//input[@aria-labelledby='a-autoid-0-announce']");

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito; }

    By btnCarrti= By.xpath("//a[@id='nav-cart']");

    public By getBtnCarrito() {
        return btnCarrti;
    }
}

