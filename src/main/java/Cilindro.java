public class Cilindro extends Circulo{
    private double altura;
    private Circulo circulo;

    public Circulo getCirculo() {
        return circulo;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(double altura, Circulo circulo) {
        super(circulo.getRadio(), circulo.getColor());
        this.altura = altura;
        this.circulo = circulo;
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", circulo=" + circulo +
                '}';
    }

    public double volumen(){
        return area() * getAltura();
    }

}
