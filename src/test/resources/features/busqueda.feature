#language: es

  Característica: Buscar y agregar productos al carrito

  Escenario: Cargar al carrito de compra un producto encontrado a traves de busqueda con nombre del articulo

    Dado que el usuario se encuentre en la pagina  de amazon
    Cuando busca el articulo Alexa
    Y navega a la pagina dos de los resultados de busqueda obtenido
    Y selecciona el tercer item de los resultados
    Entonces agrega al carrito el tercer item si esta disponible para compra.

    Escenario: Error al Cargar al carrito de compra un producto encontrado a traves de busqueda con nombre del articulo

      Dado que el usuario se encuentre en la pagina  de amazon
      Cuando busca el articulo Alexa
      Y navega a la pagina dos de los resultados de busqueda obtenido
      Y selecciona el tercer item de los resultados
      Entonces no encuentra agrega al carrito el tercer item si esta disponible para compra.