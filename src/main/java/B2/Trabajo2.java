package B2;
import java.util.Scanner;
public class Trabajo2 {

    // Mis atributos
    private String marca;
    private String modelo;
    private double precio;
    private String sistemaOperativo;
    private String almacenamiento;
    private String ram;
    private String camara;
    private boolean encendido;

    // Este es el Constructor
    public Trabajo2(String marca, String modelo, double precio, String sistemaOperativo, String almacenamiento, String ram, String camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.almacenamiento=almacenamiento;
        this.ram=ram;
        this.camara=camara;

        this.encendido = false;  // Inicialmente el celular está apagado
    }

    // Estos son los Métodos getter y setter para el atributo precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // y otros metodos, encender, mostrar informacion y
    public void encender() {
        encendido = true;
        System.out.println("El celular está encendido.");
    }

    public void mostrarInformacion() {


        System.out.println("Información del celular: \n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("Capacidad de memoria interna en Gb: " + almacenamiento);
        System.out.println("Ram: " + ram);
        System.out.println("Camara: " + camara);

        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Trabajo2
        Trabajo2 celular = new Trabajo2("Samsung", "Galaxy S21", 999.99, "Android","128","6","Si");


        System.out.println("Información actual del celular:");
        celular.mostrarInformacion();

        celular.encender();

        System.out.println("\nInformación después de encender el celular:");
        celular.mostrarInformacion();


        // Solicito el precio del celular
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el nuevo precio del celular: ");
        double nuevoPrecio = scanner.nextDouble();


        celular.setPrecio(nuevoPrecio);

        // Imprimir la información despues de capturar el precio
        System.out.println("\nInformación actualizada del celular después de cambiar el precio:");
        celular.mostrarInformacion();
    }
}
