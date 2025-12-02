import java.util.Scanner;

public class EjerciciosAdicionales {
    public static void main(String[] args) {
        Ejercicio1();
        // Ejercicio2();
        // Ejercicio3();
        // Ejercicio4();
        // Ejercicio5();
        // Ejercicio6();
        // Ejercicio7();
        // Ejercicio8();
        // Ejercicio9();
        // Ejercicio10();
    }

    public static void Ejercicio1() {
        // Declaración e inicialización de variables
        int num1 = 6;
        int num2 = 2;
        int num3 = 1;
        int num4 = 2;

        // Operaciones aritméticas o cálculos: (*, +, -)
        int parte1 = num1 / num2;
        int parte2 = num3 + num4;

        // Forma1
        int resultado1 = num2 * (parte2);
        int forma1 = num1 / resultado1;

        // Forma2
        int forma2 = parte1 * parte2;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("El resultado de la forma 1 es: %d%n", forma1);
        System.out.printf("El resultado de la forma 2 es: %d", forma2);

        /* Respondiendo a las preguntas: 
        * - ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
        * R: Ambos resultados son correctos de la operación "6 / 2 ( 1 + 2 )"
        * - Explique por que la otra calculadora genera un resultado diferente.
        * R: La calculadora digital (la 2da) genera otro resultado debido a que utiliza el principio de papomudas
        * (paréntesis, potencias, multiplicación, división, adición, sustracción), por ende primero resuelve el
        * paréntesis, dando como resultado 3, luego se va a la multiplicación de 2*(3), dando como resultado 6 y
        * por último se realiza la división de 6 / 6, dando como resultado 1. En cambio el resultado de la calculadora
        * del celular hace la operatoria directa entre 6 / 2 * ( 1 + 2 ), lo cual si hacemos la operación, entendemos que
        * 6 / 2 = 3 y (1 + 2) = 3, quedando la operatoria de 3 * 3, dandonos el resultado final de 9.
        */ 
    }

    public static void Ejercicio2() {
        // Declaración e inicialización de variables
        double precio = 5.95d;

        // Operaciones aritméticas o cálculos: (*, +, -)
        // Calcular el precio por kilo (10 porciones de 100 gramos)
        double precioPorKilo = precio * 10;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("El precio por kilo del producto Pernil Iberic D'Engreix Llen. Azuaga es: %.2f Euro(s)", precioPorKilo);

        /* Respondiendo a la pregunta: 
         * - ¿Crees que es correcto el precio?
         * R: El precio por kilo que el vendedor nos dice de 29,75€ es incorrecto debido a que el en realidad es de 59,50€ y
         * lo que puedo visualizar es que el precio que el vendedor dice es solo por 500 gramos del producto 
         * que son 5 porciones.
        */
    }

    public static void Ejercicio3() {
        // Declaración e inicialización de variables
        int pecesRojos = 284;
        int pecesAzules = 163;

        // Operaciones aritméticas o cálculos: (*, +, -)
        int totalPecesAcuario = pecesRojos + pecesAzules;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("Total de peces dentro del acuario: %d", totalPecesAcuario);

        /* Respondiendo a la pregunta: 
         * - ¿Cuántos peces hay en total dentro del acuario?
         * R: En total dentro del acuario hay 447 peces.
        */
    }

    public static void Ejercicio4() {
        // Declaración e inicialización de variables
        double dineroInicial = 23.00d;
        double dineroFinal = 12.75d;

        // Operaciones aritméticas o cálculos: (*, +, -)
        double dineroGastado = dineroInicial - dineroFinal;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("Carmen ha gastado un total de: %.2f Euro(s) en la salida al cine con sus amigos", dineroGastado);
    }

    public static void Ejercicio5() {
        // Declaración e inicialización de variables
        int precioPC = 660;
        double descuento = 0.90d;

        // Operaciones aritméticas o cálculos: (*, +, -)
        double precioTotalPC = precioPC * descuento;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("Tengo que pagar en total por el ordenador con todos los accesorios: %.0f Euro(s)", precioTotalPC);

        /* Respondiendo a la pregunta: 
         * - ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?
         * R: Tengo que pagar en total por el ordenador con todos los accesorios: 594 Euro(s).
        */
    }

    public static void Ejercicio6() {
        // Declaración e inicialización de variables
        int dineroPagado = 34;
        double descuentoSumado = 1.15;
        
        // Operaciones aritméticas o cálculos: (*, +, -)
        double precioSinDescuento = dineroPagado * descuentoSumado;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("El precio del pantalón antes de aplicarle el descuento era de: %.2f Euro(s)", precioSinDescuento);
    }

    public static void Ejercicio7() {
        Scanner scanner = new Scanner(System.in);

        // Declaración e inicialización de variables
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        double division = 0;

        // Solicitar al usuario que ingrese dos números
        System.out.println("--- CALCULADORA BASICA ---");

        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        System.out.println();

        // Operaciones aritméticas o cálculos: (*, +, -)
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("El resultado de la suma es: %d%n", suma);
        System.out.printf("El resultado de la resta es: %d%n", resta);
        System.out.printf("El resultado de la multiplicacion es: %d%n", multiplicacion);
        System.out.printf("El resultado de la division es: %.1f%n", division);

        scanner.close();
    }

    public static void Ejercicio8() {
        Scanner scn = new Scanner(System.in);

        // Declaración e inicialización de variables
        int longitud = 0;
        int ancho = 0;

        // Solicitar al usuario que ingrese la longitud y el ancho del rectángulo
        System.out.print("Ingrese la longitud del rectangulo: ");
        longitud = scn.nextInt();

        System.out.print("Ingrese el ancho del rectangulo: ");
        ancho = scn.nextInt();
        System.out.println();

        // Operaciones aritméticas o cálculos: (*, +, -)
        int perimetro = (longitud * 2) + (ancho * 2);
        int area = longitud * ancho;
        
        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("El perimetro del rectangulo es: %d cm%n", perimetro);
        System.out.printf("El área del rectangulo es: %d cm²", area);

        scn.close();
    }

    public static void Ejercicio9() {
        Scanner scn = new Scanner(System.in);

        // Declaración e inicialización de variables
        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        // Solicitar al usuario la temperatura en grados celsius
        System.out.print("Ingrese la temperatura a convertir: ");
        celsius = scn.nextDouble();
        System.out.println();

        // Operaciones aritméticas o cálculos: (*, +, -)
        fahrenheit = celsius * 9 / 5 + 32;
        kelvin = celsius + 273.15;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("La temperatura en grados fahrenheit es: %.3f%n", fahrenheit);
        System.out.printf("La temperatura en grados kelvin es: %.3f", kelvin);

        scn.close();
    }

    public static void Ejercicio10() {
        Scanner scn = new Scanner(System.in);

        // Declaración e inicialización de variables
        float num1 = 0f;
        float num2 = 0f;
        float num3 = 0f;
        float mediaAritmetica = 0f;

        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingresa el primer numero: ");
        num1 = scn.nextFloat();

        System.out.print("Ingresa el segundo numero: ");
        num2 = scn.nextFloat();

        System.out.print("Ingresa el tercer numero: ");
        num3 = scn.nextFloat();
        System.out.println();

        // Operaciones aritméticas o cálculos: (*, +, -)
        mediaAritmetica = (num1 + num2 + num3) / 3;

        // Mostrar resultados formateados con ´System.out.printf()´
        System.out.printf("La media aritmetica de los 3 numeros introducidos es: %f", mediaAritmetica);

        scn.close();
    }
}
