package B4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Trabajo5 {

    private List<String> nombres;
    private List<String> telefonos;
    private List<Double> notas;


    public Trabajo5() {
        // Inicializar las listas
        nombres = new ArrayList<>();
        telefonos = new ArrayList<>();
        notas = new ArrayList<>();

    }

    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres.add(scanner.nextLine());

            System.out.print("Teléfono: ");
            telefonos.add(scanner.nextLine());

            System.out.print("Nota: ");
            notas.add(scanner.nextDouble());
            scanner.nextLine();  // Consumir el salto de línea


        }
    }

    public void imprimirDatos() {
        System.out.println("\nDatos de los estudiantes:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres.get(i));
            System.out.println("Teléfono: " + telefonos.get(i));
            System.out.println("Nota: " + notas.get(i));

            System.out.println();
        }
    }

    public double calcularPromedio() {
        double sumaNotas = 0;

        for (Double nota : notas) {
            sumaNotas += nota;
        }

        return sumaNotas / 5;
    }

    public static void main(String[] args) {
        Trabajo5 trabajo = new Trabajo5();
        trabajo.capturarDatos();
        trabajo.imprimirDatos();

        // Imprimir el promedio de las notas
        System.out.println("Promedio de las notas: " + trabajo.calcularPromedio());
    }
}
