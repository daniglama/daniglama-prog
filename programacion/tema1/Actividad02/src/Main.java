//ejercicio1 Mayor de edad
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu edad:");
        int edad = sc.nextInt();

        if (edad >=18) {
            System.out.println("eres mayor de edad");
        }
    }
}

//ejercicio2 Mayor o menor de edad
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu edad:");
        int edad = sc.nextInt();

        if (edad >=18) {
            System.out.println("eres mayor de edad");
        } else {
                System.out.println("eres menor de edad");
            }

    }
}

//ejercicio3 Los 20 primeros números naturales
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

//ejercicio4 Números pares del 1 al 200 sumando de 2 en 2
public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 200; i = i+2) {
            System.out.println(i);
        }
    }
}


//ejercicio 5 Números pares del 1 al 200 sumando de 1 en 1
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

//ejercicio 6 Números del 1 hasta N
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

//ejercicio 7 Convertir nota numérica en nota alfabética
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota: ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota < 3) {
            System.out.println("Muy Deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");

        } else if (nota < 6) {
            System.out.println("bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9) {
            System.out.println("Sobresaliente");
        }
    }
}

//ejercicio 8 factoroial
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial es: " + factorial);
    }
}

//ejercicio 9 Sumar un segundo a una hora

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        segundos++;

        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos >= 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.println("La hora es: " + horas + ":" + minutos + ":" + segundos);
    }
}

//ejercicio 10 Leer 10 números y comprobar si hay algún negativo
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            boolean hayNegativo = false;

            for (int i = 1; i <= 10; i++) {

                System.out.print("introduce el numero" + i + ":");
                int numero = sc.nextInt();

                if (numero < 0) {
                    hayNegativo = true;
                }
            }

            if (hayNegativo) {
                System.out.println("se ha leido algun numero negativo");
            } else {
                System.out.println("no se ha leido ningun numero negativo");
            }
        }
    }

//ejercicio 11 Contar positivos y negativos

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int positivos = 0;
            int negativos = 0;

            for (int i = 1; i <= 10; i++) {

                System.out.print("Introduce el número " + i + ": ");
                int numero = sc.nextInt();

                if (numero > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }

            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
        }
    }

//ejercicio 12 Leer números hasta introducir 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hayNegativo = false;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Introduce un número (0 para terminar): ");
        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
                hayNegativo = true;
            }

            System.out.print("Introduce otro número (0 para terminar): ");
            numero = sc.nextInt();
        }
        if (hayNegativo) {
            System.out.println("Se ha leído algún número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
    }
}

//ejercicio 13 Suma y producto de los 10 primeros números naturales

public class Main {
    public static void main(String[] args) {

        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            producto = producto * i;
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }
}

//ejercicio 14 Salario neto semanal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce las horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        double salarioBruto;
        double impuestos;
        double salarioNeto;

        if (horas <= 35) {
            salarioBruto = horas * tarifa;
        } else {
            salarioBruto = 35 * tarifa + (horas - 35) * tarifa * 1.5;
        }

        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = 400 * 0.25 + (salarioBruto - 900) * 0.45;
        }

        salarioNeto = salarioBruto - impuestos;

        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");
    }
}

