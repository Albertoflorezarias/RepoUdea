package B5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Trabajo6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);


            LocalDate fechaActual = LocalDate.now();


            int edadEnAnios = fechaActual.getYear() - fechaNacimiento.getYear();


            if (fechaNacimiento.plusYears(edadEnAnios).isAfter(fechaActual)) {
                edadEnAnios--;
            }


            System.out.println("La edad es: " + edadEnAnios + " años.");
        } catch (Exception e) {
            System.out.println("Error al procesar la fecha. Asegúrate de usar el formato correcto (yyyy-MM-dd).");
        }
    }
}
