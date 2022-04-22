package estruturasdecontroles;

import java.util.Scanner;

public class Aula68_DesafioSemana {

    public static void main(String[] args) {
        // Dados do teclado
        Scanner entrada =  new Scanner(System.in);
        // Solicitação do usuário
        System.out.println("Digite o nome do dia: ");
        String dia = entrada.next();
        // Tomada de decisão

        if("domingo".equalsIgnoreCase(dia)){
            System.out.println(1);
        } else if("segunda".equalsIgnoreCase(dia)){
            System.out.println(2);
        }else if("terça".equalsIgnoreCase(dia)){
            System.out.println(3);
        }else if("quarta".equalsIgnoreCase(dia)){
            System.out.println(4);
        }else if("quinta".equalsIgnoreCase(dia)){
            System.out.println(5);
        }else if("sexta".equalsIgnoreCase(dia)){
            System.out.println(6);
        } else if("sabado".equalsIgnoreCase(dia)){
            System.out.println(7);
        } else{
            System.out.println("Dia inválido!!");
        }

        entrada.close();
    }
}
