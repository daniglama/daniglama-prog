//ejercicio1
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

//ejercicio2
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

//ejercicio3
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

//ejercicio4
public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 200; i = i+2) {
            System.out.println(i);
        }
    }
}


//ejercicio 5
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

//ejercicio 6
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

//ejercicio 7
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

//ejercicio 8
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