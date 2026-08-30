public class EmpleadoContratista extends Empleado{
    private double horasTrabajadas;
    private double tarifaProyecto;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaProyecto() {
        return tarifaProyecto;
    }

    public void setTarifaProyecto(double tarifaProyecto) {
        this.tarifaProyecto = tarifaProyecto;
    }

    public EmpleadoContratista(String nombre, double salario, double horasTrabajadas, double tarifaProyecto) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaProyecto = tarifaProyecto;
    }

    @Override
    public double calcularPago(){
       return getHorasTrabajadas()*getTarifaProyecto();
    }

}
