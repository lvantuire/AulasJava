package AulaLoopseArrays.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia_doWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contator = 1;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            contator = contator+1;
            soma = soma+numero;

            if(numero > maior) {
                maior = numero;
           }

        } while(contator <= 5);

        double media = soma/contator;

        System.out.println("Maior Numero Digitado foi........: " + maior);
        System.out.println("A média dos numeros digitador foi: " + media);


    }

}
