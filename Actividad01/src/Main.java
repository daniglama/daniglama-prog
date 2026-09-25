//ejercicio1

public class Main {
    public static void main (String[]args) {
        System.out.println("buenos dias");
    }
}
//ejercicio2
public class Main {
    public static void main(String[] args) {

        int lado = 5;
        int area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);

    }
}

//ejercicio3
import java.util.Scanner; // Esto permite leer lo que escribamos con el teclado.

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Creamos el teclado:
        System.out.print("Introduce el lado del cuadrado: "); // Pedimos el lado
        double lado = teclado.nextDouble(); // Guardamos lo que escriba el usuario

        double area = lado * lado; // Calculamos

        System.out.println("El área del cuadrado es: " + area); // Y mostramos

    }
}
//ejercicio4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //leer teclado

        System.out.print("Introduce el primer número: "); //pedir numeros
        double numero1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = teclado.nextDouble();

        double suma = numero1 + numero2; //ecuaciones
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("Suma: " + suma); //resultados
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);

    }
}

//ejercicio5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el radio: ");

        double radio = scan.nextDouble();

        System.out.print("la longitud de la circunferencia es: " + (2 * radio + Math.PI));
        System.out.print("la longitud del area es: " + (Math.PI * radio * radio));
        System.out.print("la longitud de la esfera es: " + ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3)));
    }
}
//ejercicio6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el precio original: ");
        double precioOriginal = teclado.nextDouble();

        System.out.print("Introduce el precio de venta: ");
        double precioVenta = teclado.nextDouble();

        double descuento = ((precioOriginal - precioVenta) / precioOriginal) * 100;

        System.out.println("El descuento es del " + descuento + "%");

    }
}

//ejercicio7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce las millas marinas: ");
        double millas = teclado.nextDouble();
        double metros = millas * 1852;
        System.out.println("La distancia en metros es: " + metros);
    }
}

//ejercicio8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo  numero ");
        int numero2 = teclado.nextInt();

        System.out.println("Orden ascendente:");
        System.out.println(Math.min(numero1, numero2));
        System.out.println(Math.max(numero1, numero2));
    }
}

//ejercicio9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo  numero ");
        int numero2 = teclado.nextInt();

        int mayor = Math.max(numero1, numero2);

        System.out.println("El mayor es: " + mayor);
        System.out.println("¿Son iguales?: " + (numero1 == numero2));
    }
}
//ejercicio10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo  numero ");
        int numero2 = teclado.nextInt();

        System.out.print("Introduce el tercer  numero ");
        int numero3 = teclado.nextInt();

        int mayor = Math.max(numero1, Math.max(numero2, numero3));

        System.out.println("El mayor es: " + mayor);
    }
}

//ejercicio11
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo  numero ");
        int numero2 = teclado.nextInt();

        double suma = numero1 + numero2; //ecuaciones
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("Suma: " + suma); //resultados
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);

    }
}
//ejercicio12
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo  numero ");
        int numero2 = teclado.nextInt();

        int mayor = Math.max(numero1, numero2);

        System.out.println("El mayor es: " + mayor);
    }
}

//ejercicio13

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero ");
        int numero = teclado.nextInt();

        String[] resultado = {"negativo", "positivo", "positivo"};

        int posicion = (int) Math.signum(numero) + 1;

        System.out.println("El número es " + resultado[posicion]);

    }
}