import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ProgramaTriangulo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        Triangulo x, y; 

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as três medidas do Triângulo x ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Digite as três medidas do Triângulo y ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("A área do triângulo x é de %.2f%n", areaX);
        System.out.printf("A área do triângulo y é de %.2f%n", areaY);

        if (areaX > areaY){
            System.out.printf("O maior triângulo é x, com a área de: %.2f%n ", areaX);
        } else{
             System.out.printf("O maior triângulo é y, com a área de: %.2f%n ", areaY);
        }





        scan.close();




    }
}
