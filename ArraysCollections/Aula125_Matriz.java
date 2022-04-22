package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Aula125_Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas Notas: ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;

        for(int aluno = 0; aluno < notasDaTurma.length; aluno++){
            for(int notas = 0; notas < notasDaTurma[aluno].length; notas++){

                System.out.printf("Informe a nota %d do aluno %d: ", aluno, notas);

                notasDaTurma[aluno][notas] = entrada.nextDouble();
                total += notasDaTurma[aluno][notas];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média é: " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();
    }
}
