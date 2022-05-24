package src;

public class Mensagem {
    public static void obterMensagem(int hora){
        if(hora >=1 && hora <= 11){
            mensagemBomdia();
        } else if(hora > 11 && hora < 18) {
            mensagemBoatarde();
        } else if(hora >=18 && hora < 24){
            mensagemBoaNoite();
        }
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa Noite!");

    }

    private static void mensagemBoatarde() {
        System.out.println("Boa Tarde!");
    }

    private static void mensagemBomdia() {
        System.out.println("Bom dia!");
    }
}
