//EJERCICIO 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

//EJERCICIO 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}

//EJERCICIO 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10]; //creamos el array

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble(); //Cada número que introduce el usuario se guarda aqui en numeros[i]
        }

        double maximo = numeros[0];
        double minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}

//EJERCICIO 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un entero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos = sumaNegativos + numeros[i];
            }
        }

        System.out.println("Suma de positivos: " + sumaPositivos);
        System.out.println("Suma de negativos: " + sumaNegativos);

        sc.close();
    }
}

//EJERCICIO 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[20];
        double suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }

        media = suma / numeros.length;

        System.out.println("La media es: " + media);

        sc.close();
    }
}

//EJERCICIO 6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño N: ");
        int n = sc.nextInt();

        System.out.print("Introduce el valor M: ");
        int m = sc.nextInt();

        if (n <= 0) {
            System.out.println("N debe ser mayor que cero.");
        } else {
            int[] numeros = new int[n];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = m;
            }

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}

//EJERCICIO 7
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce P: ");
        int p = sc.nextInt();

        System.out.print("Introduce Q: ");
        int q = sc.nextInt();

        int tamaño = Math.abs(q - p) + 1;
        int[] numeros = new int[tamaño];

        int incremento;

        if (p <= q) {
            incremento = 1;
        } else {
            incremento = -1;
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = p + i * incremento;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

//EJERCICIO 8
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        System.out.print("Introduce R: ");
        double r = sc.nextDouble();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                contador++;
            }
        }

        System.out.println("Cantidad de valores mayores o iguales a R: "
                + contador);

        sc.close();
    }
}

//EJERCICIO 9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + (int) (Math.random() * 10);
        }

        System.out.print("Introduce N (entre 1 y 10): ");
        int n = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                System.out.println("Aparece en la posicion: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no aparece en el array.");
        }

        sc.close();
    }
}

//EJERCICIO 10
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de personas: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe haber al menos una persona.");
        } else {
            double[] alturas = new double[n];
            double suma = 0;

            for (int i = 0; i < alturas.length; i++) {
                System.out.print("Introduce una altura en metros: ");
                alturas[i] = sc.nextDouble();
                suma = suma + alturas[i];
            }

            double media = suma / n;
            double maximo = alturas[0];
            double minimo = alturas[0];

            int porEncima = 0;
            int porDebajo = 0;

            for (int i = 0; i < alturas.length; i++) {
                if (alturas[i] > maximo) {
                    maximo = alturas[i];
                }

                if (alturas[i] < minimo) {
                    minimo = alturas[i];
                }

                if (alturas[i] > media) {
                    porEncima++;
                } else if (alturas[i] < media) {
                    porDebajo++;
                }
            }

            System.out.println("Altura media: " + media);
            System.out.println("Altura maxima: " + maximo);
            System.out.println("Altura minima: " + minimo);
            System.out.println("Por encima de la media: " + porEncima);
            System.out.println("Por debajo de la media: " + porDebajo);
        }

        sc.close();
    }
}

//EJERCICIO 11
public class Main {
    public static void main(String[] args) {
        int[] primero = new int[100];
        int[] segundo = new int[100];

        for (int i = 0; i < primero.length; i++) {
            primero[i] = i + 1;
        }

        for (int i = 0; i < primero.length; i++) {
            segundo[i] = primero[primero.length - 1 - i];
        }

        System.out.println("Primer array:");

        for (int i = 0; i < primero.length; i++) {
            System.out.println(primero[i]);
        }

        System.out.println("Segundo array:");

        for (int i = 0; i < segundo.length; i++) {
            System.out.println(segundo[i]);
        }
    }
}

//EJERCICIO 12
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        String opcion;

        do {
            System.out.println("\na. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.next();

            switch (opcion) {
                case "a":
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Posicion " + i + ": "
                                + numeros[i]);
                    }
                    break;

                case "b":
                    System.out.print("Introduce el valor V: ");
                    int v = sc.nextInt();

                    System.out.print("Introduce la posicion P (0-9): ");
                    int p = sc.nextInt();

                    if (p >= 0 && p < numeros.length) {
                        numeros[p] = v;
                        System.out.println("Valor guardado.");
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                    break;

                case "c":
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (!opcion.equals("c"));

        sc.close();
    }
}

//EJERCICIO 13
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor inicial V: ");
        int v = sc.nextInt();

        System.out.print("Introduce el incremento I: ");
        int incremento = sc.nextInt();

        System.out.print("Introduce el numero de valores N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N debe ser mayor que cero.");
        } else {
            int[] secuencia = new int[n];

            for (int i = 0; i < secuencia.length; i++) {
                secuencia[i] = v + i * incremento;
            }

            for (int i = 0; i < secuencia.length; i++) {
                System.out.println(secuencia[i]);
            }
        }

        sc.close();
    }
}

//EJERCICIO 14
public class Main {
    public static void main(String[] args) {
        int tamaño = 0;

        for (int i = 1; i <= 10; i++) {
            tamaño = tamaño + i;
        }

        int[] numeros = new int[tamaño];
        int posicion = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                numeros[posicion] = i;
                posicion++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}