import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra vocal o consonante (A-Z): ");
        char letra = sc.next().charAt(0);
        // Opción A, B: Normalizar primero a letra Mayúscula
        // char letraMayuscula = Character.toUpperCase(letra);
        // Opción C:
        // String vocales = "AEIOUaeiou";

        while (letra < 'A' || (letra > 'Z' && letra < 'a') || letra > 'z') {
            System.out.print("Entrada inválida. Por favor, ingrese una letra válida (A-Z): ");
            letra = sc.next().charAt(0);
        }

        if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' ||
            letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
            System.out.println("La letra ingresada (" + letra + ") es una Vocal.");
        } else {
            System.out.println("La letra ingresada (" + letra + ") es una Consonante.");
        }

        // Opción A:
        // if (letraMayuscula == 'A' || letraMayuscula == 'E'  ||
        //     letraMayuscula == 'I' || letraMayuscula == 'O' || letraMayuscula == 'U') {
        //     System.out.println("La letra ingresada (" + letraMayuscula + ") es una Vocal.");
        // } else {
        //     System.out.println("La letra ingresada (" + letraMayuscula + ") es una Consonante.");
        // }

        // Opción B: Usar switch (más legible)
        // switch (letraMayuscula) {
        //     case 'A':
        //     case 'E':
        //     case 'I':
        //     case 'O':
        //     case 'U':
        //         System.out.println("La letra ingresada (" + letra + ") es una Vocal.");
        //         break;
        //     default:
        //         System.out.println("La letra ingresada (" + letra + ") es una Consonante.");
        // }

        // Opción C: String contains (creativo)
        // if (vocales.indexOf(letra) != -1) {
        //     System.out.println("La letra ingresada (" + letra + ") es una Vocal.");
        // } else {
        //     System.out.println("La letra ingresada (" + letra + ") es una Consonante.");
        // }   

        sc.close();
    }
}
