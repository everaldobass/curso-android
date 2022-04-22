package ArraysCollections;

public class Aula122_Foreach {

    public static void main(String[] args) {

        double[] notas = {9.9, 8.7, 6.8,7.8};

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        System.out.println("\n***********************");

        for(double nota: notas){
            System.out.println(nota);

        }
    }
}
