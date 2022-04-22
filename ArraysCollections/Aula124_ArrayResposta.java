package ArraysCollections;


import java.util.Scanner;

public class Aula124_ArrayResposta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as notas: ");
        int qtdNotas = entrada.nextInt();

        // Criando o Array
        double[] notas =  new double[qtdNotas];

        // Percorrendo o Array
        for (int i = 0; i < notas.length; i++){
            System.out.println("Informe a nota: " + (i +  1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("Média: " + media);



        //System.out.println(Arrays.toString(notas));
        entrada.close();
    }
}
