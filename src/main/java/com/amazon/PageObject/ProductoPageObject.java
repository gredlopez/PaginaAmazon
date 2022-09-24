package com.amazon.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoPageObject extends PageObject {

    By lnbProducto3 = By.xpath("(((//div[@class='a-section'])[3]/div/div/div[@class='sg-col-inner'])[1]/div)[2]");

    public By getLnbProducto3() {
        return lnbProducto3;
    }

    By btnCarroDeCompra = By.xpath("//input[@aria-labelledby='exportAlternativeTriggerButton-announce']");

    public By getBtnCarroDeCompra() { return btnCarroDeCompra;//va en carro de compra
    }

    By btnCarroDeCompraError = By.xpath("//input[@aria-labelledby='exportAlternativeTriggerButton-announceError']");

    public By getBtnCarroDeCompraError() { return btnCarroDeCompraError;//va en carro de compra
    }
}
