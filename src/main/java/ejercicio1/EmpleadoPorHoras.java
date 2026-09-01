package ejercicio1;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHoras(String nombre, double salario, double horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }


    public EmpleadoPorHoras(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago() {
        return getSalario() * getHorasTrabajadas();
    }

}
