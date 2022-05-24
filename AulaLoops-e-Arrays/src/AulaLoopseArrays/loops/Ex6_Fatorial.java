package AulaLoopseArrays.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número deseja Fatorar?...:");
        int fatorial = scan.nextInt();

        int multiplica = 1;

        for(int i = fatorial; i>=1; i--) {
            multiplica = multiplica*i;

        }
        System.out.println(fatorial+"!  ="+multiplica);
    }
}
