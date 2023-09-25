import java.util.Scanner;

public class AreaTrianRectEAreaCirc {
    public static void main(String[] args) {
        Scanner sc = new Scnanner(System.in);

        double A, B, C;
        double AreaTriangulo, AreaRectangulo, AreaCirculo, AreaTrapezio, AreaQuadrado;
        System.out.println("Digite o valor da base");
        A = sc.nextDouble();
        System.out.println("Digite o valor da altura");
        B =sc.nextDouble();

        AreaTriangulo = (A*B)/2;
        System.out.println("A area do triangulo é " + AreaTriangulo);

        AreaRectangulo = A*B;
        System.out.println("A area do Rectangulo é " + AreaRectangulo);


        System.out.println("Digite o valor do raio");
        C =sc.nextDouble();
        AreaCirculo = C*C*3.14;
        System.out.println("A area do circulo é " + AreaCirculo);


         System.out.println("Digite o valor da base menor");
        A = sc.nextDouble();
        System.out.println("Digite o valor da base maior");
        B =sc.nextDouble();
        System.out.println("Digite o valor da altura");
        C = sc.nextDouble();

        AreaTrapezio = (A+B)*C/2;
        System.out.println("A area do trapezio é " + AreaTrapezio);

        AreaQuadrado = B*B;
        System.out.println("A area do quadrado é " + AreaQuadrado);



    }
}
