package figuras;

import java.util.Scanner;

public class ImpresoraFiguras {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        Circulo Imprimir = new Circulo();
        Triangulo Imprimir2 = new Triangulo();
        Cuadrado Imprimir3= new Cuadrado();
        

        System.out.println("seleccionar una figura");

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Círculo\n"
                    + "2. Triángulo\n"
                    + "3. Cuadrado\n");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:

                    System.out.print("Introduzca el radio de su circulo");
                    var circuloRadio = scanner.nextLine();
                    Imprimir.setRadio(opcion);
                    System.out.println("El area del circulo es: " + Imprimir.areaCirculo()+ "\nEL Perimetro del circulo es: " + Imprimir.Perimetro());

                    break;
                case 2:

                    System.out.print("Introduzca la altura del  triangulo");
                    var rianguloRadio = scanner.nextLine();
                    Imprimir2.setRadio(opcion);
                   
                    System.out.println("El area del Triangulo es: " + Imprimir2.areaTriangulo()+ "\nEL Perimetro del Triangulo es: " + Imprimir2.PerimetroTriangulo());

                    break;
                case 3:
                    System.out.print("Introduzca el ancho de su cuadrado");
                    var cuadradoAncho = scanner.nextLine();
                    Imprimir.setRadio(opcion);
                    System.out.println("El area del cuadrado es: " + Imprimir3.getArea()+ "\nEL Perimetro del circulo es: " + Imprimir3.getPerimetro());
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        }

    }

}
