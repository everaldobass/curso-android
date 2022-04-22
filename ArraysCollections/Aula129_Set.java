package ArraysCollections;

import java.util.HashSet;

public class Aula129_Set {

    public static void main(String[] args) {
        /**
         // Pode ser Heterogênio
         // Pode ser Homogênio
         // Não aceita obj. duplicados
         // Pode ser ornedanado
         // Não é indexado
         */

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        // Remover elemente de um conjunto

        System.out.println(conjunto.remove("Teste"));

        System.out.println("Tamanho é: " + conjunto.size());

    }

}
