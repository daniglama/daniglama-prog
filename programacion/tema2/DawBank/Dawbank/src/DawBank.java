
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta = null;

        System.out.println("===== BIENVENIDO A DAWBANK =====");

        // Crear cuenta bancaria
        while (cuenta == null) {

            try {
                System.out.print("Introduce el IBAN: ");
                String iban = sc.nextLine();

                System.out.print("Introduce el nombre del titular: ");
                String titular = sc.nextLine();

                cuenta = new CuentaBancaria(iban, titular);

                System.out.println("Cuenta creada correctamente.");

            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Vuelve a introducir los datos.");
            }
        }

        int opcion = 0;

        // Menu principal
        do {

            System.out.println("\n===== MENU DAWBANK =====");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");

            System.out.print("Selecciona una opcion: ");

            try {

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        cuenta.mostrarDatos();
                        break;

                    case 2:
                        System.out.println("IBAN: " + cuenta.getIban());
                        break;

                    case 3:
                        System.out.println("Titular: " + cuenta.getTitular());
                        break;

                    case 4:
                        System.out.println("Saldo disponible: "
                                + cuenta.getSaldo() + " euros");
                        break;

                    case 5:
                        System.out.print("Cantidad a ingresar: ");
                        double ingreso = Double.parseDouble(sc.nextLine());
                        cuenta.ingresar(ingreso);
                        break;

                    case 6:
                        System.out.print("Cantidad a retirar: ");
                        double retirada = Double.parseDouble(sc.nextLine());
                        cuenta.retirar(retirada);
                        break;

                    case 7:
                        cuenta.mostrarMovimientos();
                        break;

                    case 8:
                        System.out.println("Gracias por utilizar DawBank.");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debes introducir un numero valido.");
                opcion = 0;
            }

        } while (opcion != 8);

        sc.close();
    }
}
