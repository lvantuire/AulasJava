package AulaLoopseArrays.loops;

import java.util.Scanner;

public class Ex2_Nota_While {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Digite a Nota: ");
        nota = scan.nextInt();


        while(nota < 0 || nota > 10) {
            System.out.println("Digite a Nota: ");
            nota = scan.nextInt();

            if(nota < 0 || nota > 10) {
                System.out.println("NOTA INVALIDA, DIGITE NOVAMENTE");
            }
        }

        System.out.println("Ok, nota Valida, nota digitada..: " + nota);


    }

}
