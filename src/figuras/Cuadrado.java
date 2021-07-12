
package figuras;


public class Cuadrado {
    
    public double ancho, area, perimetro;
    
    

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        area = Math.pow(ancho,2);
        return area;
    }

    public void setArea(double area) {
        
        this.area = area;
    }

    public double getPerimetro() {
        double ancho = 0;
        ancho = (ancho * 4);
        return ancho;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "ancho=" + ancho + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
}
