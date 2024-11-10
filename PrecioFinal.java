public class PrecioFinal {





    public double getPrecioFinal(Producto producto){
 
        double iva = producto.getIva();
        double precio = producto.getPrecioProducto();

return precio + (precio * iva);


    }
}
