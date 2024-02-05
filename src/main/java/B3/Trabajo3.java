package B3;
import java.util.Scanner;
public class Trabajo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");

        Integer numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0){
            System.out.println("el numero es negativo");
        } else if (numero == 0){
            System.out.println("el numero es 0");

        }

        else{
            System.out.println("debe ingresar un numero");
        }


        scanner.close();
    }
}
