package com.amazon.StepDefinitions;

import com.amazon.Steps.BusquedaStep;
import com.amazon.Steps.CarritoCompraStep;
import com.amazon.Steps.PaginaPrincipalStep;
import com.amazon.Steps.ProductoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class BusquedaStepDefinitions {

    @Steps
    CarritoCompraStep carritoCompraStep;
    @Steps
    ProductoStep productoStep;

    @Steps
    BusquedaStep busquedaStep;

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;


    @Dado("^que el usuario se encuentre en la pagina  de amazon$")
    public void queElUsuarioSeEncuentreEnLaPaginaDeAmazon() {
    paginaPrincipalStep.abrirPagina();

    }

    @Cuando("^busca el articulo Alexa$")
    public void buscaElArticuloAlexa() throws IOException {
        paginaPrincipalStep.txtBusqueda();


    }

    @Cuando("^navega a la pagina dos de los resultados de busqueda obtenido$")
    public void navegaALaPaginaDosDeLosResultadosDeBusquedaObtenido() {
        paginaPrincipalStep.btnBusqueda();
        busquedaStep.btnPestaña2();
    }

    @Cuando("^selecciona el tercer item de los resultados$")
    public void seleccionaElTercerItemDeLosResultados() {
        productoStep.productodeLaPestaña2();


    }

    @Entonces("^agrega al carrito el tercer item si esta disponible para compra\\.$")
    public void agregaAlCarritoElTercerItemSiEstaDisponibleParaCompra() {
        productoStep.clicEnElBotonCarroCompra();
        carritoCompraStep.BotonparaAgregarAlCarritoCompra();
        carritoCompraStep.BotonCarrito();


    }

    @Entonces("^no encuentra agrega al carrito el tercer item si esta disponible para compra\\.$")
    public void noEncuentraAgregaAlCarritoElTercerItemSiEstaDisponibleParaCompra() {
        productoStep.clicEnElBotonCarroCompraError();


    }

}
