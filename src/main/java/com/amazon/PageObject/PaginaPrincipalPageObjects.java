package com.amazon.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.amazon.com")

public class PaginaPrincipalPageObjects extends PageObject{

    By txtBusqueda = By.xpath("//input[@id='twotabsearchtextbox']");
    By btnBusqueda =By.xpath("//input[@id='nav-search-submit-button']");




    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
