//EJERCICIO 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10]; // creamos el array

        // Introducimos los números

// Para introducir los números usamos un for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");

            //Cada número que introduce el usuario se guarda aqui en numeros[i]
            numeros[i] = sc.nextDouble();
        }

        // Mostramos los números
        System.out.println("Los números introducidos son:");

// hacemos otro for para recorrer el array y mostrarlo.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}


//EJERCICIO 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10]; //creamos el array
        double suma = 0; //acumulador, empezamos la suma en 0

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble(); //Cada número que introduce el usuario se guarda aqui en numeros[i]

            suma = suma + numeros[i];
        }

        System.out.println("La suma es: " + suma);
    }
}

//EJERCICIO 3