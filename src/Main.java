public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 22;
        cliente.nombre = "Pepe";
        cliente.telefono= 664896541;
        cliente.credito= 3000;

        System.out.println("la edad del cliente es de " + cliente.edad  + " años");
        System.out.println("el cliente se llama " + cliente.nombre);
        System.out.println("el teléfono del cliente es el " + cliente.telefono);
        System.out.println("el crédito del cliente es de " + cliente.credito + " Euros");

        trabajador.edad = 24;
        trabajador.nombre = "Juan";
        trabajador.telefono = 667458521;
        trabajador.salario = 1300;

        System.out.println("la edad del trabajador es de " + trabajador.edad  + " años");
        System.out.println("el trabajador se llama " + trabajador.nombre);
        System.out.println("el teléfono del trabajador es el " + trabajador.telefono);
        System.out.println("el trabajador tiene un salario de " + trabajador.salario + " Euros");

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}