package Exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println(("Resultado: " + resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numerador não pode ser texto");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro divisão por Zero");
        }
        finally {
            System.out.println("Deu Erro");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
