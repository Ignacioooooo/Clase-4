public class Main {
    public static void main(String[] args) {

        Persona PrimeraPersona = new Persona();

        PrimeraPersona.CrearPersona("Lautaro",20,90.5,1.80,"26/07/2002");

        System.out.println("Persona Creada");
        System.out.println("Nombre:" + PrimeraPersona.getNombre());
        System.out.println("edad:" + PrimeraPersona.getEdad());
        System.out.println("Peso:" + PrimeraPersona.getPeso());
        System.out.println("Altura:" + PrimeraPersona.getAltura());
        System.out.println("Fecha de Nacimiento:" + PrimeraPersona.getFechadeNacimiento());
    }
}