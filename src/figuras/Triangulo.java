package figuras;

import static figuras.Circulo.PI;

public class Triangulo {

    public double lado1, lado2, lado3, area, sp, perimetro;
    public double radio;

    public Triangulo() {
        radio = 0.00;
    }

    public void setRadio(double añadirRadio) {
        radio = añadirRadio;
    }

    public double getRadio() {
        return radio;
    }

    public double areaTriangulo() {
        double area;
        area = (Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)));
        return area;
    }

    public double PerimetroTriangulo() {
        double Perimetro;
        Perimetro = 2 * PI * radio;
        return Perimetro;
    }



}
