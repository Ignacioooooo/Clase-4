public class Carrito {
 public static void main(String[] args) {
  Productos miObjeto = new Productos();
  String[] datos = {"Jabón en polvo", "Esponjas", "Chocolates"};
  miObjeto.llenarArray(datos);

System.out.println("Tiene en su carrito:");
for (String Producto : datos){
 System.out.println(Producto);
}
 }
}


