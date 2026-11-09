
public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private double saldo;

    private Movimiento[] movimientos;
    private int totalMovimientos;

    private static final int MAX_MOVIMIENTOS = 100;
    private static final double SALDO_MINIMO = -50;
    private static final double LIMITE_AVISO = 3000;

    // Constructor
    public CuentaBancaria(String iban, String titular) {

        if (iban == null || !iban.matches("[A-Za-z]{2}[0-9]{22}")) {
            throw new IllegalArgumentException("IBAN no valido");
        }

        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular es obligatorio");
        }

        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;

        this.movimientos = new Movimiento[MAX_MOVIMIENTOS];
        this.totalMovimientos = 0;
    }

    // Mostrar datos de la cuenta
    public void mostrarDatos() {
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " euros");
    }

    // Obtener IBAN
    public String getIban() {
        return iban;
    }

    // Obtener titular
    public String getTitular() {
        return titular;
    }

    // Obtener saldo
    public double getSaldo() {
        return saldo;
    }

    // Realizar ingreso
    public boolean ingresar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser mayor que 0.");
            return false;
        }

        if (totalMovimientos >= MAX_MOVIMIENTOS) {
            System.out.println("ERROR: No se pueden guardar mas movimientos.");
            return false;
        }

        saldo += cantidad;

        movimientos[totalMovimientos] =
                new Movimiento("Ingreso", cantidad);

        totalMovimientos++;

        System.out.println("Ingreso realizado correctamente.");

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }

        if (cantidad > LIMITE_AVISO) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        return true;
    }

    // Realizar retirada
    public boolean retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser mayor que 0.");
            return false;
        }

        if (totalMovimientos >= MAX_MOVIMIENTOS) {
            System.out.println("ERROR: No se pueden guardar mas movimientos.");
            return false;
        }

        if (saldo - cantidad < SALDO_MINIMO) {
            System.out.println("ERROR: No puedes dejar el saldo por debajo de -50 euros.");
            return false;
        }

        saldo -= cantidad;

        movimientos[totalMovimientos] =
                new Movimiento("Retirada", cantidad);

        totalMovimientos++;

        System.out.println("Retirada realizada correctamente.");

        if (saldo < 0) {
            System.out.println("AVISO: Saldo negativo");
        }

        if (cantidad > LIMITE_AVISO) {
            System.out.println("AVISO: Notificar a hacienda");
        }

        return true;
    }

    // Mostrar historial de movimientos
    public void mostrarMovimientos() {

        if (totalMovimientos == 0) {
            System.out.println("No hay movimientos registrados.");
            return;
        }

        for (int i = 0; i < totalMovimientos; i++) {
            movimientos[i].mostrarInfoMovimiento();
        }
    }
}
