//EJERCICIO 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        sc.close();
    }
}

//EJERCICIO 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String texto1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String texto2 = sc.nextLine();

        if (texto1.equals(texto2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Son iguales ignorando mayusculas y minusculas.");
        } else {
            System.out.println("Son diferentes incluso ignorando mayusculas y minusculas.");
        }

        sc.close();
    }
}

//EJERCICIO 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();

        String codigo = nombre.substring(0, 3)
                + apellido1.substring(0, 3)
                + apellido2.substring(0, 3);

        codigo = codigo.toUpperCase();

        System.out.println("Codigo de usuario: " + codigo);

        sc.close();
    }
}

//EJERCICIO 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            switch (letra) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);

        sc.close();
    }
}

//EJERCICIO 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");

        boolean esPalindromo = true;

        int izquierda = 0;
        int derecha = frase.length() - 1;

        while (izquierda < derecha) {
            if (frase.charAt(izquierda) != frase.charAt(derecha)) {
                esPalindromo = false;
                break;
            }

            izquierda++;
            derecha--;
        }

        if (esPalindromo) {
            System.out.println("La frase es un palindromo.");
        } else {
            System.out.println("La frase no es un palindromo.");
        }

        sc.close();
    }
}