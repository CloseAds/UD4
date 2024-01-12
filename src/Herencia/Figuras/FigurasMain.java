package Herencia.Figuras;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class FigurasMain {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserte 0 para salir");

        int opcion = 0;

        do {

            System.out.println("Introduce que figura geométrica desea calcular:");
            System.out.println("Pulse C (círculo),");
            System.out.println("Pulse T (triángulo),");
            System.out.println("Pulse X (cuadrado),");

            char caracter = s.next().charAt(0);

            System.out.println("Introduzca 1 para calcular el area de la figura");
            System.out.println("Introduzca 2 para calcular el perímetro de la figura");
            System.out.println("Introduzca 3 para calcular ambos");

            int numero = s.nextInt();

           if (numero == 1){
               System.out.println();
           }
           else if (numero == 2){
               System.out.println();
           }
           else if (numero == 3){
               System.out.println();
               System.out.println();
           }

        } while (opcion == 0);


        Circulo c1 = new Circulo("circulo1", 50);
        TrianguloEquilatero t1 = new TrianguloEquilatero("triángulo",15, 7);
        Cuadrado x1 = new Cuadrado("cuadrado",25);

        double areaC = c1.obtenerArea();
        double perimetro = c1.obtenerPerimetro();

        System.out.println(areaC);
        System.out.println(perimetro);

    }

}
