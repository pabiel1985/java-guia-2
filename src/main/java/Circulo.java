public class Circulo {
    private double radio;
    private String color;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public double area() {
        return Math.PI * Math.pow(getRadio(),2);
    }
}
