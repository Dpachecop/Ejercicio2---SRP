public class Main {
    public static void main(String[] args) {
        

Producto producto = new Producto(
      "Salsa tomate",
      2600,
      1245);
      PrecioFinal precioFinal = new PrecioFinal();
      precioFinal.getPrecioFinal(producto);  
      Etiquetas etiquetas = new Etiquetas();
      etiquetas.GenerarEtiqueta(producto, precioFinal); 

       producto = new Producto(
      "Arroz a granel",
      10000,
      6712);
       precioFinal = new PrecioFinal();
      precioFinal.getPrecioFinal(producto);  
       etiquetas = new Etiquetas();
      etiquetas.GenerarEtiqueta(producto, precioFinal); 
      
    }


    
}
