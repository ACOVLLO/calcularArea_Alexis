package figuras;

public class Circunferencia {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimir() {
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double d = 2 * radio;
        double d1 = 2 * radio;
        final double PI = 3.1416;
        double area = 2 * PI * radio * radio;
        System.out.println("El área es: " + area);
    }

    /*public void calcularArea() {
        double d = 2 * radio;
        final double PI = 3.1416;
        double area = 2 * PI * radio * radio;
        System.out.println("El área es: " + area);
    }*/

    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2) return true;
            else return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1) return true;
            else return false;
        }
    }
}
