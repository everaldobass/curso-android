package estruturasdecontroles;

import java.util.Scanner;

public class Aula66_ifeleif {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double nota = entrada.nextDouble();
        if(nota > 10  || nota < 0){
            System.out.println("Nota inválida: " + nota);
        } else if(nota >= 8.1){
            System.out.println("Conceito A: " + nota);
        }else if(nota >= 6.1 ){
            System.out.println("Conceito B: " + nota);
        }
        entrada.close();
    }
    
}
