package AulaLoopseArrays.loops;

import java.util.Scanner;

public class Ex5_TabuadaComFor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número deseja Tabuar?...:");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int x = 1; x <= 10; x++) {
            System.out.println(tabuada + " X " + x + " = " + tabuada * x);
        }

    }
}
