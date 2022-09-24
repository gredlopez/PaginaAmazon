package com.amazon.PageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class BusquedaPageObject extends PageObject {



    By btnPestaña2= By.xpath("//a[.='2']");

    public By getBtnPestaña2() {
        return btnPestaña2;
    }

    //By clicAlArticulo = By.partialLinkText("");

//    public By getClicAlArticulo() {
  //      return clicAlArticulo;
    //}
}

