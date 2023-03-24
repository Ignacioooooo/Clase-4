public class Persona {
    String nombre;
    int edad;
    double peso;
    double altura;
    String FechadeNacimiento;

    public void CrearPersona(String _nombre, int _edad, double _peso, double _altura, String _Fecha) {

              nombre = _nombre;
              edad = _edad;
              peso = _peso;
              altura = _altura;
              FechadeNacimiento = _Fecha;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getFechadeNacimiento() {
        return FechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        FechadeNacimiento = fechadeNacimiento;
    }




}

