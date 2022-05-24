package AulaLoopseArrays.loops;

import java.util.Objects;
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = " ";
        int idade = 0;

        while (!Objects.equals(nome, "0")) {
            System.out.println("Nome.: ");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Finalizado por 0");
        System.out.println(idade);

    }
}
