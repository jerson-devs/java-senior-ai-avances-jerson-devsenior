import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra (A-Z): ");
        char letra = sc.next().charAt(0);

        while (letra < 'A' || (letra > 'Z' && letra < 'a') || letra > 'z') {
            System.out.print("Entrada inválida. Por favor, ingrese una letra válida (A-Z): ");
            letra = sc.next().charAt(0);
        }

        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("La letra ingresada (" + letra + ") es Mayúscula.");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("La letra ingresada (" + letra + ") es Minúscula.");
        }

        // Solución alternativa usando métodos de Character:
        // while (opción 1)
        // while (!Character.isUpperCase(letra) && !Character.isLowerCase(letra)) {
        //     System.out.print("Entrada inválida. Por favor, ingrese una letra válida (A-Z): ");
        //     letra = sc.next().charAt(0);
        // }

        // while (opción 2)
        // while (!Character.isLetter(letra)) {
        //     System.out.print("Entrada inválida. Por favor, ingrese una letra válida (A-Z): ");
        //     letra = sc.next().charAt(0);
        // }

        // if (Character.isUpperCase(letra)) {
        //     System.out.println("La letra ingresada (" + letra + ") es Mayúscula.");
        // } else if (Character.isLowerCase(letra)) {
        //     System.out.println("La letra ingresada (" + letra + ") es Minúscula.");
        // }
        
        sc.close();
    }
}
