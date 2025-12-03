import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        // if (num % 2 == 0) {
        //     System.out.println("El numero ingresado ("+ num +") es Par.");
        // } else {
        //     System.out.println("El numero ingresado ("+ num +") es Impar.");
        // }

        // Solución elegante con operador ternario
        String resultado = (num % 2 == 0) ? "El numero ingresado (" + num + ") es Par." 
                                          : "El numero ingresado ("+ num +") es Impar.";

        System.out.println(resultado);

        sc.close();
    }
}
