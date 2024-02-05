package B3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Seleccione la estructura Listas por que a pesar de que el enunciado del
// ejercicio dice 5 estudiantes,estos valores pueden cambiar.
// NO elegi un Arrglo por que estos son de un tamaño fijo y no hay la posibilidad de cambiarlo posteriormente.
public class Trabajo4 {
    private List<String> nombres;
    private List<String> telefonos;
    private List<Double> notas;


    public Trabajo4() {
        // Inicializar las listas
        nombres = new ArrayList<>();
        notas = new ArrayList<>();
        telefonos = new ArrayList<>();
    }

    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);

        // Capturar la nota, nombre y teléfono de cada estudiante
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres.add(scanner.nextLine());

            System.out.print("Teléfono: ");
            telefonos.add(scanner.nextLine());
            // scanner.nextLine();  // Consumir el salto de línea

            System.out.print("Nota: ");
            notas.add(scanner.nextDouble());
            scanner.nextLine();  // Consumir el salto de línea


        }
    }

    public void imprimirDatos() {
        // Imprimir los datos de los estudiantes
        System.out.println("\nDatos de los estudiantes:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + nombres.get(i));
            System.out.println("Nota: " + notas.get(i));
            System.out.println("Teléfono: " + telefonos.get(i));
            System.out.println();
        }
    }

    public double calcularPromedio() {
        // Calcular el promedio de las notas
        double sumaNotas = 0;
        for (Double nota : notas) {
            sumaNotas += nota;
        }
        return sumaNotas / 5;
    }

    public static void main(String[] args) {
        Trabajo4 trabajo = new Trabajo4();
        trabajo.capturarDatos();
        trabajo.imprimirDatos();

        // Imprimir el promedio de las notas
        System.out.println("Promedio de las notas: " + trabajo.calcularPromedio());
    }
}