public class Carrito {
 public static void main(String[] args) {
  Productos miObjeto = new Productos();
  String[] datos = {"Jabón en polvo", "Esponjas", "Chocolates"};
  miObjeto.llenarArray(datos);

System.out.println("Tiene en su carrito:");
for (String Producto : datos){
 System.out.println(Producto);
}
 Productos precio = new Productos();
int[] datoss ={40,10,100};
precio.llenarArrayy(datoss);
System.out.println("precios:");
for (int Productoss : datoss){
 System.out.println(Productoss);
}
 System.out.println("total del Carrito:");
 int suma = 0;
 for(int q =0; q<datoss.length; q++){
  suma += datoss[q];
 }
System.out.println(suma);

 }
}


