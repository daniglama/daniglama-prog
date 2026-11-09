import java.util.Scanner;

public class GestionColeccion {


    public static void mostrarMenu() {

        System.out.println("\n GESTION DE COLECCION ");
        System.out.println("1. Modificar coleccion");
        System.out.println("2. Estadisticas de la coleccion");
        System.out.println("3. Ampliar coleccion");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion ");
    }

    public static void insertarNumero(
            Integer[] coleccion, Scanner teclado) {

        System.out.print("Introduce la posicion: ");
        int posicion = teclado.nextInt();

        if (posicion < 0 || posicion >= coleccion.length) {

            System.out.println("Posicion incorrecta.");

        } else if (coleccion[posicion] != null) {

            System.out.println("Esa posicion esta ocupada.");

        } else {

            System.out.print("Introduce numero: ");
            int numero = teclado.nextInt();

            coleccion[posicion] = numero;

            System.out.println("Numero insertado.");
        }
    }

    public static void borrarNumero(
            Integer[] coleccion, Scanner teclado) {

        System.out.print("Introduce la posicion a borrar: ");
        int posicion = teclado.nextInt();

        if (posicion < 0 || posicion >= coleccion.length) {

            System.out.println("Posicion incorrecta.");

        } else if (coleccion[posicion] == null) {

            System.out.println("posicion vacia.");

        } else {


            coleccion[posicion] = null;

            System.out.println("eliminado correctamente.");
        }
    }

    public static void modificarNumero(
            Integer[] coleccion, Scanner teclado) {
        System.out.print("Introduce la posicion a modificar: ");

        int posicion = teclado.nextInt();

        if (posicion < 0 || posicion >= coleccion.length) {
            System.out.println("posicion incorrecta ");

        } else if (coleccion[posicion] == null) {
            System.out.println("np hay ningun numero en esa posicion");

        } else {
            System.out.println(" introduce el nuevo numero");

            int numero = teclado.nextInt();

            coleccion[posicion] = numero;

            System.out.println("numero modificado correctamente");
        }
    }

    public static void mostrarColeccion(Integer[] coleccion) {

        System.out.println("\n COLECCION ");

        for (int i = 0; i < coleccion.length; i++) {

            System.out.println("Posicion " + i + ": " + coleccion[i]);
        }
    }

    public static int calcularSuma(Integer[] coleccion) {
        int suma = 0;

        for (int i = 0; i < coleccion.length;
        i++){

            if (coleccion[i] != null) {

                suma = suma + coleccion[i];
            }
        }
        return suma;
    }

    public static double calcularMedia(Integer[] coleccion) {

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < coleccion.length; i++) {

            if (coleccion[i] != null) {

                suma = suma + coleccion[i];

                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        } else {

            return (double) suma / contador;
        }
    }

    public static Integer calcularMaximo(Integer[] coleccion) {

        Integer maximo = null;

        for (int i = 0; i < coleccion.length; i++) {

            if (coleccion[i] != null) {

                if (maximo == null || coleccion[i] > maximo) {

                    maximo = coleccion[i];
                }
            }
        }
        return maximo;
    }

    public static Integer calcularMinimo(Integer[] coleccion) {

        Integer minimo = null;

        for (int i = 0; i < coleccion.length; i++) {

            if (coleccion[i] != null) {

                if (minimo == null || coleccion[i] < minimo) {

                    minimo = coleccion[i];
                }
            }
        }
        return minimo;
    }

    public static void mostrarEstadisticas(Integer[] coleccion) {

        int contador = 0;

        for (int i = 0; i < coleccion.length; i++) {
            if (coleccion[i] != null) {
                contador++;
            }
        }

        System.out.println("estadisticas");
        if (contador == 0) {

            System.out.println("La coleccion esta vacia.");

        } else {

            System.out.println("Suma: " + calcularSuma(coleccion));

            System.out.println("Media: " + calcularMedia(coleccion));

            System.out.println("Maximo: " + calcularMaximo(coleccion));

            System.out.println("Minimo: " + calcularMinimo(coleccion));

            System.out.println("Numeros almacenados: " + contador);
        }
    }




    public static void menuModificar(
            Integer[] coleccion, Scanner teclado) {

        int opcion;

        do {

            System.out.println("\n MODIFICAR COLECCION ");
            System.out.println("1. Insertar numero");
            System.out.println("2. Borrar numero");
            System.out.println("3. Modificar numero");
            System.out.println("4. Mostrar coleccion");
            System.out.println("5. Volver al menu principal");

            System.out.print("Elige una opcion ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    insertarNumero(coleccion, teclado);
                    break;

                case 2:
                    borrarNumero(coleccion, teclado);
                    break;

                case 3:
                    modificarNumero(coleccion, teclado);
                    break;

                case 4:
                    mostrarColeccion(coleccion);
                    break;

                case 5:
                    System.out.println("volviendo al menu principal");
                    break;

                default:
                    System.out.println("opcion incorrecta.");
            }

        } while (opcion != 5);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidad;

        do {

            System.out.print("Introduce el tamaño inicial de la coleccion: ");
            cantidad = teclado.nextInt();

            if (cantidad <= 0) {

                System.out.println("El tamaño debe ser mayor que cero.");
            }

        } while (cantidad <= 0);

        Integer[] coleccion = new Integer[cantidad];

        int opcion;
        do {

            mostrarMenu();

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    menuModificar(coleccion, teclado);
                    break;

                case 2:

                    mostrarEstadisticas(coleccion);
                    break;

                case 3:

                case 4:

                    System.out.println("Finalizando el programa.");
                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}