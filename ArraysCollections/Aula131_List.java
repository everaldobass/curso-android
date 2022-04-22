package ArraysCollections;

import java.util.ArrayList;

public class Aula131_List {

    public static void main(String[] args) {

        /**
         // Pode ser Heterogênio
         // Pode ser Homogênio
         // aceita obj. duplicados
         // Pode ser ornedanado
         // Não é indexado
         */

        ArrayList<Aula131_Usuario> lista = new ArrayList<>();

        Aula131_Usuario u1 = new Aula131_Usuario("Everaldo");

        lista.add(u1);
        lista.add(new  Aula131_Usuario("Carlos"));
        lista.add(new  Aula131_Usuario("Lia"));
        lista.add(new  Aula131_Usuario("Bia"));
        lista.add(new  Aula131_Usuario("Manu"));
        lista.add(new  Aula131_Usuario("Ana"));

        System.out.println(lista.get(3));

        // Remover da lista
        System.out.println("Remover de uma lista: " + lista.remove(1));

        for(Aula131_Usuario u: lista){
            System.out.println(u.nome);
        }
    }


}
