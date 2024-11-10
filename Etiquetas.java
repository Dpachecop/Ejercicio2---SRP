public class Etiquetas {
    

public void GenerarEtiqueta(Producto producto, PrecioFinal precioFinal){


    System.out.println("         Producto #" + producto.getidProducto());
    System.out.println("**********************************");
    System.out.println("Nombre: " + producto.getNombreProducto());
    System.out.println("Precio: " + producto.getPrecioProducto());
    System.out.println("iva aplicado: " + producto.getIva());
    System.out.println("Precio final: " + precioFinal.getPrecioFinal(producto));

}


}
