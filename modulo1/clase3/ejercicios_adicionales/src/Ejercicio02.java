import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        
        System.out.println("Ingrese el primer numero (ej: 6.2)");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero (ej: 4.8)");
        num2 = sc.nextDouble();
        System.out.println("Ingrese el tercer numero (ej: 9.7)");
        num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero 1 (" + num1 + ") ingresado es el mayor de los tres.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero 2 (" + num2 + ") ingresado es el mayor de los tres.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero 3 (" + num3 + ") ingresado es el mayor de los tres.");
        } else if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("Todos los numeros son iguales: (" + num1 + ", " + num2 + ", " + num3 + ")");
        } else if (num1 == num2) {
            System.out.println("El numero 1 (" + num1 + ") es igual al numero 2 (" + num2 + ")");
        } else if (num1 == num3) {
            System.out.println("El numero 1 (" + num1 + ") es igual al numero 3 (" + num3 + ")");
        } else if (num2 == num3) {
            System.out.println("El numero 2 (" + num2 + ") es igual al numero 3 (" + num3 + ")");
        }

        sc.close();
    }
}
