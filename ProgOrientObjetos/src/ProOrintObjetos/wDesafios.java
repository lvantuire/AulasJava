package ProOrintObjetos;

import java.util.Scanner;

public class wDesafios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double soma = 0;
        double n = 1;


        //complete o codigo
        while (n >= 1) {
            n = leitor.nextInt();
            if (n > 0) {
                soma += n;
                cont++;
            }
        }

        double media = soma / cont;
        System.out.println(String.format("%.2f", media).replace(',', '.'));
    }
}

