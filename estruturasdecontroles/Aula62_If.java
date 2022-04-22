package estruturasdecontroles;

import java.util.Scanner;

public class Aula62_If {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

         System.out.println("Iforme a média: ");
         double media = entrada.nextDouble();

         if(media <= 10 && media >= 7.0){
             System.out.println("Resultado Aprovado: " + media);
         }

         if(media < 7 && media >= 4.5){
            System.out.println("Resultado Recuperação: " + media);
         }

         if(media < 4.5 && media < 0){
            System.out.println("Resultado Reprovado: " + media);
         }

         entrada.close();
    }
    
}
