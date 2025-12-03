import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double numReal = 0;

        System.out.print("Ingrese un numero real (ej: 1.5): ");
        numReal = sc.nextDouble();

        if (numReal == 0) {
            System.out.println("El numero {" + numReal + "} ingresado es cero.");
        } else if (numReal > 0) {
            System.out.println("El numero {" + numReal + "} ingresado es positivo.");
        } else {
            System.out.println("El numero {" + numReal + "} ingresado es negativo.");
        }

        sc.close();
    }
}
