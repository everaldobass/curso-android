package estruturasdecontroles;

import java.util.Scanner;

public class Aula72_DoWhile {
    public static void main(String[] args) {

        // if(...) sentença; ou {}
        // while(...) sentença; ou {}
        // for(...;...;...) sentença; ou {}
        // do {} while(...);

        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do{
            System.out.println("Você precisa falar as palavras: ");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
        }while (!texto.equalsIgnoreCase("Por favor"));
        System.out.println("Obrigado!!");
        entrada.close();
    }

}
