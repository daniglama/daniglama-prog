
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private static int contador = 1;

    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.id = contador++;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.now().format(formato);

        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfoMovimiento() {
        System.out.println("ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad + " euros");
        System.out.println("-------------------------");
    }
}
