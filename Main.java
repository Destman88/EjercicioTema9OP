public class Main {
    public static void main(String[] args){
        //Objeto Cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Derick");
        cliente1.setEdad(34);
        cliente1.setTelefono(638926264);
        cliente1.setCredito(10000);

        System.out.println("El nombre del cliente: " + cliente1.getNombre());
        System.out.println("Su edad es de: " + cliente1.getEdad() + " años");
        System.out.println("El número telefónico es: " + cliente1.getTelefono());
        System.out.println("Tiene un crédito por $" + cliente1.getCredito());
        System.out.println("*******************************************");

        //Objeto trabajador
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Steven");
        trabajador1.setEdad(34);
        trabajador1.setTelefono(638926264);
        trabajador1.setSalario(1500);

        System.out.println("El nombre del trabajador: " + trabajador1.getNombre());
        System.out.println("Su edad es de: " + trabajador1.getEdad() + " años");
        System.out.println("El número telefónico es: " + trabajador1.getTelefono());
        System.out.println("Tiene un salario de $" + trabajador1.getSalario() + " mensuales");
    }
}
//Clase persona las variables nombre, edad y teléfono
class Persona{
    private String nombre;
    private int edad;
    private int telefono;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getTelefono() {
        return telefono;
    }
}
//Clase cliente hereda de persona y le añade la variable crédito
class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}
//Clase Trabajador hereda de persona y le añade la variable Salario
class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
