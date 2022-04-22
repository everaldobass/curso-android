package estruturasdecontroles;

import java.util.Scanner;

public class Aula75_forDesafio {

    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);

        int contador;

        System.out.println("Digite um número: ");
        contador = entrada.nextInt();
        */
        for(int contador = 10; contador >= 0; contador-= 2 ){
            System.out.println("Valor do contador: " + contador);
        }
        /*entrada.close();*/
    }
}
