package AulaLoopseArrays.arrays;

public class Ex1_OrdamInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int count = 0;
        while (count < (vetor.length)) {
            System.out.print((vetor[count]+" "));
            count++;
        }
        System.out.println(" ");
        int countnew = vetor.length-1;
        while (countnew >= 0) {
            System.out.print((vetor[countnew]+" "));
            countnew--;
        }


    }
}
