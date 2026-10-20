//EJERCICIO 1
public class Main {
    public static void main(String[] args) {
        int[][] numeros = new int[5][5];
        int valor = 1;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = valor;
                valor++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


//EJERCICIO 2
public class Main {
    public static void main(String[] args) {
        int[][] tablas = new int[10][10];

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < tablas.length; i++) {
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.print(tablas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


//EJERCICIO 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de filas N: ");
        int n = sc.nextInt();

        System.out.print("Introduce el numero de columnas M: ");
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Las dimensiones deben ser mayores que cero.");
        } else {
            int[][] numeros = new int[n][m];

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    System.out.print("Introduce el valor de la fila "
                            + i + ", columna " + j + ": ");
                    numeros[i][j] = sc.nextInt();
                }
            }

            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    if (numeros[i][j] > 0) {
                        positivos++;
                    } else if (numeros[i][j] < 0) {
                        negativos++;
                    } else {
                        ceros++;
                    }
                }
            }

            System.out.println("Numeros positivos: " + positivos);
            System.out.println("Numeros negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }

        sc.close();
    }
}


//EJERCICIO 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[4][5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce las notas del Alumno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota de la asignatura "
                        + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            double minimo = notas[i][0];
            double maximo = notas[i][0];
            double suma = 0;

            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < minimo) {
                    minimo = notas[i][j];
                }

                if (notas[i][j] > maximo) {
                    maximo = notas[i][j];
                }

                suma = suma + notas[i][j];
            }

            double media = suma / notas[i].length;

            System.out.println("\nAlumno " + (i + 1));
            System.out.println("Nota minima: " + minimo);
            System.out.println("Nota maxima: " + maximo);
            System.out.println("Nota media: " + media);
        }

        sc.close();
    }
}


//EJERCICIO 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de personas: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe haber al menos una persona.");
        } else {
            double[][] personas = new double[n][2];

            for (int i = 0; i < personas.length; i++) {
                System.out.println("Persona " + (i + 1));

                System.out.print("Genero (0 = varon, 1 = mujer): ");
                personas[i][0] = sc.nextInt();

                System.out.print("Sueldo: ");
                personas[i][1] = sc.nextDouble();
            }

            double sumaHombres = 0;
            double sumaMujeres = 0;

            int contadorHombres = 0;
            int contadorMujeres = 0;

            for (int i = 0; i < personas.length; i++) {
                if (personas[i][0] == 0) {
                    sumaHombres = sumaHombres + personas[i][1];
                    contadorHombres++;
                } else if (personas[i][0] == 1) {
                    sumaMujeres = sumaMujeres + personas[i][1];
                    contadorMujeres++;
                }
            }

            if (contadorHombres > 0) {
                System.out.println("Sueldo medio de los hombres: "
                        + (sumaHombres / contadorHombres));
            } else {
                System.out.println("No hay hombres registrados.");
            }

            if (contadorMujeres > 0) {
                System.out.println("Sueldo medio de las mujeres: "
                        + (sumaMujeres / contadorMujeres));
            } else {
                System.out.println("No hay mujeres registradas.");
            }
        }

        sc.close();
    }
}