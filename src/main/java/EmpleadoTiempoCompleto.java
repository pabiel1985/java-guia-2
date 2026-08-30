public class EmpleadoTiempoCompleto extends Empleado {

    @Override
    public double calcularPago() {
        return getSalario();
    }

    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }
}
