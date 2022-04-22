package ArraysCollections;

import java.util.Arrays;

public class Aula121_Array {
    public static void main(String[] args) {
        double [] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.9;
        notasAlunoA[2] = 6.9;
        notasAlunoA[3] = 9.9;

        System.out.println(Arrays.toString(notasAlunoA));

        System.out.println("***********************");
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];

        }
        System.out.println(total / notasAlunoA.length );

    }
}
