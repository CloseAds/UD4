package Herencia.Figuras;

import java.util.Scanner;

public class FigurasMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserte un numero negativo para salir del menú");

        int opcion;

        do {
            System.out.println("Introduce que figura geométrica desea calcular:");
            System.out.println("Pulse C (círculo),");
            System.out.println("Pulse T (triángulo),");
            System.out.println("Pulse X (cuadrado),");

            char caracter = s.next().charAt(0);

            System.out.println("Introduzca 1 para calcular el area de la figura");
            System.out.println("Introduzca 2 para calcular el perímetro de la figura");
            System.out.println("Introduzca 3 para calcular ambos");

           if (caracter == 'C'){

           }

        } while (opcion < 0){

        }


        Circulo c1 = new Circulo("circulo1", 50);
        TrianguloEquilatero t1 = new TrianguloEquilatero("triángulo",15, 7);
        Cuadrado x1 = new Cuadrado("cuadrado",25);

        double areaC = c1.obtenerArea();
        double perimetro = c1.obtenerPerimetro();

        System.out.println(areaC);
        System.out.println(perimetro);

    }

}
