package ejercicio5;

public class Staff extends  Persona{
    private double salario;
    private String turno;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Staff(long dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return "ejercicio5.Staff{" +
                super.toString() +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
