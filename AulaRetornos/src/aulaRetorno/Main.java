package aulaRetorno;

public class Main {

    public static void main(String[] args) {
        //quadriilatero
        System.out.println("Exercicio Quadrilatero");

        double areaDoQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado" + areaDoQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do Retangulo" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do Trapezio" + areaTrapezio);


    }


}
