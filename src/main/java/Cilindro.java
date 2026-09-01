public class Cilindro extends Circulo {
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, double altura) {
        super(radio, "rojo");
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro subclase de " +
                super.toString() +
                " altura=" + altura +
                '}';
    }

    @Override
    public double area() {
        return (2 * Math.PI * getRadio() * getAltura()) + 2 * super.area();
    }

    public double volumen() {
        return super.area() * getAltura();
    }

}
