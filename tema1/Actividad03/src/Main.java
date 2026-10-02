//ejercicio1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad multiplo de 5: ");
        int cantidad = sc.nextInt();

        int billetes500 = cantidad / 500;
        cantidad = cantidad % 500;

        int billetes200 = cantidad / 200;
        cantidad = cantidad % 200;

        int billetes100 = cantidad / 100;
        cantidad = cantidad % 100;

        int billetes50 = cantidad / 50;
        cantidad = cantidad % 50;

        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;

        int billetes10 = cantidad / 10;
        cantidad = cantidad % 10;

        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;

        System.out.println("Billetes de 500 €: " + billetes500);
        System.out.println("Billetes de 200 €: " + billetes200);
        System.out.println("Billetes de 100 €: " + billetes100);
        System.out.println("Billetes de 50 €: " + billetes50);
        System.out.println("Billetes de 20 €: " + billetes20);
        System.out.println("Billetes de 10 €: " + billetes10);
        System.out.println("Billetes de 5 €: " + billetes5);
    }
}

//ejercicio2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println();
            System.out.println("----- CALCULADORA -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Introduce el primer número: ");
                double numero1 = sc.nextDouble();

                System.out.print("Introduce el segundo número: ");
                double numero2 = sc.nextDouble();

                switch (opcion) {

                    case 1:
                        System.out.println("Resultado: " + (numero1 + numero2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (numero1 - numero2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (numero1 * numero2));
                        break;

                    case 4:

                        if (numero2 == 0) {
                            System.out.println("No se puede dividir entre 0");
                        } else {
                            System.out.println("Resultado: " + (numero1 / numero2));
                        }

                        break;
                }

            } else if (opcion != 5) {

                System.out.println("Opción incorrecta.");

            }

        } while (opcion != 5);

        System.out.println("Programa terminado.");
    }
}