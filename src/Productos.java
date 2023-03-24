

public class Productos{
    private String[] miArray;
    private int[] miArrayotro;

    public void llenarArray(String[] datos) {
        miArray = datos;
    }

    public String[] obtenerArray() {
        return miArray;
    }
    public void llenarArrayy(int[] datos) {
        miArrayotro = datos;
    }

    public int[] obtenerArrayy() {
        return miArrayotro;
    }
}


