package com.amazon.Steps;

import com.amazon.Utils.Datos;
import com.amazon.PageObject.PaginaPrincipalPageObjects;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaPrincipalStep {

    static final String NOMBRE_EXCEL = "PaginaAmazon.xlsx";
    private static final String HOJA_EXCEL = "Busqueda";


    Datos datos = new Datos();

    PaginaPrincipalPageObjects paginaPrincipalPageObjects= new PaginaPrincipalPageObjects();

    @Step
    public void abrirPagina()
    { paginaPrincipalPageObjects.open(); }

    @Step
    public void txtBusqueda() throws IOException {
        paginaPrincipalPageObjects.getDriver().findElement(paginaPrincipalPageObjects.getTxtBusqueda()).
                sendKeys(datos.leerDatosExcel(NOMBRE_EXCEL, HOJA_EXCEL,1,0));
    }

    @Step
    public void btnBusqueda() {
        paginaPrincipalPageObjects.getDriver().findElement(paginaPrincipalPageObjects.getBtnBusqueda()).click();
    }

}
