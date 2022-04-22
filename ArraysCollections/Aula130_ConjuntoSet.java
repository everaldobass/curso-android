package ArraysCollections;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Aula130_ConjuntoSet {

    public static void main(String[] args) {
        // Definindo o tipo String
       // Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<>();
        lista.add(" Anderson");
        lista.add(" Eriberto");
        lista.add(" José");
        lista.add(" Maria");
        lista.add(" Carlos");


        for(String candidato: lista){
            System.out.println(candidato);
        }

    }
}
