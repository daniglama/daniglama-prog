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