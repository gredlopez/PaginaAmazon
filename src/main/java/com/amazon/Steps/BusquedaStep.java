package com.amazon.Steps;

import com.amazon.Model.EsperaImplicita;
import com.amazon.PageObject.BusquedaPageObject;
import com.amazon.Model.Scroll;
import net.thucydides.core.annotations.Step;

public class BusquedaStep {

    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Scroll scroll= new Scroll();

    BusquedaPageObject busquedaPageObject = new BusquedaPageObject();

   @Step
   public void btnPestaña2() {
       scroll.scrollElemento(busquedaPageObject.getDriver(), busquedaPageObject.getBtnPestaña2());
       esperaImplicita.esperaimplicita(20);
       busquedaPageObject.getDriver().findElement(busquedaPageObject.getBtnPestaña2()).click();
    }

   // @Step
    //public void clicAlArticulo(){
      // busquedaPageObject.getDriver().findElement(busquedaPageObject.getClicAlArticulo()).click();

    //}
}
