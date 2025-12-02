import java.util.Scanner;

public class CalculadoraCompra {
    public static void main(String[] args) {
        // Declaración e inicialización de constantes
        final double TASA_IMPUESTO = 0.15; // 15% de impuesto

        // Entrada de datos del usuario
        // Declaración e inicialización de variables
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Compra ---");

        System.out.print("Ingrese el precio unitario del articulo: ");
        var precioUnitario = scanner.nextDouble(); // Infiere double

        System.out.print("Ingrese la cantidad de artículos: ");
        var cantidad = scanner.nextInt(); // Infiere int

        System.out.print("Ingrese la cantidad pagada por el cliente: ");
        var cantidadPagada = scanner.nextDouble(); // Infiere double

        // IMPORTANTE: Consumir el salto de línea después del último nextInt() o nextDouble()
        scanner.nextLine();

        // Operaciones aritméticas o cálculos: (*, +, -)
        var subtotal = precioUnitario * cantidad;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal + montoImpuesto;
        var cambio = cantidadPagada - totalCompra;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TASA_IMPUESTO * 100, montoImpuesto); // Mostrar tasa como porcentaje
        System.out.printf("Total de la compra: $%.2f%n", totalCompra);
        System.out.printf("Cantidad Pagada: $%.2f%n", cantidadPagada);
        System.out.printf("Cambio: $%.2f%n", cambio);

        System.out.println("----------------------------");

        System.out.println("¡Gracias por su compra!");

        scanner.close();
    }
}
