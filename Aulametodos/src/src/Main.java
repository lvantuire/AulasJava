package src;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio da Calcularoda");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2);

        //Mensagem de Horario

        System.out.println("Exercicio de Mensagem de Hora");

        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(21);

        //Financiamento

        System.out.println("Exercicio de financiamento");

        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas()); // exemplo de chamada de metodo
        Emprestimo.calcular(1000,4);

    }



}
