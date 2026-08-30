import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private String id;
    private double monto;
    private LocalDateTime fecha;
    private Cliente cliente;

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Factura(double monto, Cliente cliente) {
        this.monto = monto;
        this.cliente = cliente;
        this.fecha = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
    }
}
