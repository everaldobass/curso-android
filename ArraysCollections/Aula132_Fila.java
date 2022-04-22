package ArraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Aula132_Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        /*Diferênca é o elemento da fila*/
        fila.add("Edson");
        fila.offer("Eriberto");
        fila.add("Edsuardo");
        fila.offer("Elias");
        fila.add("Henrick");
        fila.offer("Veronica");

        // Peek e Element -> obter o próximo elementos
        // da fila sem remover

        // Diferênçã é o comportamento ocorre
        // quando a fila está vazia

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança exceção

        // Fila.size
        // fila.clear
        // fila.isEmpty

        System.out.println(fila.poll()); // Retorna false
        System.out.println(fila.remove()); // Lança uma exceção

    }

}
