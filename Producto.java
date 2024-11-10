public class Producto {

   private int precioProducto;
   private String nombreProducto;
   private int idProducto;
   private double iva = 0.19;

    public Producto(String nombreProducto, int precioProducto, int idProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.idProducto = idProducto;

    }


    public String getNombreProducto(){

        return this.nombreProducto;
    }
    public int getPrecioProducto(){

        return this.precioProducto;
    }

    public int getidProducto(){

        return this.idProducto;
    }

    public double getIva(){

return this.iva;

    }

}