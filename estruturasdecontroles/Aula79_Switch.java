package estruturasdecontroles;

import java.util.Locale;
import java.util.Scanner;

public class Aula79_Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua Faixa: ");
        String faixa = entrada.next();

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
            case "roxa":
                System.out.println("Sei o Heian Godan...");
            case "verde":
                System.out.println("Sei o Heian Yoodan...");
            case "laranja":
                System.out.println("Sei o Heian Sandan...");
            case "vermelha":
                System.out.println("Sei o Heian Nidan...");
            case "amarela":
                System.out.println("Sei o Heian Shodan...");
            default:
                System.out.println("Não sei nada! ");
        }
    }
}
