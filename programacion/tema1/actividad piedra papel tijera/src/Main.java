import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final char PIEDRA = 'P';
        final char PAPEL = 'L';
        final char TIJERA = 'T';
        final char SALIR= 'S';

        System.out.println("PIEDRA, PAPEL O TIJERA");
        System.out.println("Reglas del juego:");
        System.out.println("P = Piedra");
        System.out.println("L = Papel");
        System.out.println("T = Tijera");
        System.out.println("S = Salir");
        System.out.println("piedra gana a la tijera");
        System.out.println("papel gana a la piedra");
        System.out.println("tijera ganan al papel");
        System.out.println("Si se elige lo mismo, empate");

        boolean jugando = true;

        while (jugando) {
            System.out.print("\nElige P, L, T o S: ");
            char jugador = sc.next().toUpperCase().charAt(0);

            if (jugador == SALIR) {
                jugando = false;
                System.out.println("has salido");
            } else if (jugador != PIEDRA
                    && jugador != PAPEL
                    && jugador != TIJERA) {
                System.out.println("opcion no valida, Intentalo de nuevo.");
            } else {
                int aleatorio = (int) (Math.random() * 3);
                char ordenador;

                if (aleatorio == 0) {
                    ordenador = PIEDRA;
                } else if (aleatorio == 1) {
                    ordenador = PAPEL;
                } else {
                    ordenador = TIJERA;
                }

                    System.out.println("Tu: " + jugador);
                    System.out.println("el ordenador: " + ordenador);


                    if (jugador == ordenador) {
                        System.out.println("Resultado: EMPATE, elige de nuevo");
                    } else if (
                            (jugador == PIEDRA && ordenador == TIJERA)
                                    || (jugador == PAPEL && ordenador == PIEDRA)
                                    || (jugador == TIJERA && ordenador == PAPEL)
                    ) {
                        System.out.println("Resultado: has ganado");
                    } else {
                        System.out.println("Resultado: gana el ordenador");
                    }
                }
            }
        sc.close();
    }
}