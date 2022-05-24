package AulaLoopseArrays.loops;

import java.util.Scanner;

public class Ex4_ParEImpar_doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int contador = 1;
        int numero;
        int qdtPares = 0;
        int qdtImpares = 0;

        //entrando quantidade de Numeros a Processar
        System.out.println("Quantidade de Numeros a Processar: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Digito o Numero.:");
            numero = scan.nextInt();
            contador++;

            //contando pares e impares
            if(numero % 2 ==0) {
                qdtPares++;
            } else qdtImpares++;

        } while(contador <= quantNumeros);

        System.out.println("Quantidade de n pares digitados.. :" + qdtPares);
        System.out.println("Quantidade de n impares digitados :" + qdtImpares);

    }
}
