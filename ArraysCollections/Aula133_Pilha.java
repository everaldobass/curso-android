package ArraysCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Aula133_Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Livro 1");
        livros.push("Dom Quixote");
        livros.push("Hoobit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());

        /*
        * livros.size();
        * livros.clear();
        * livros.containers();
        *  livros.isEmpty();
        *  livros.isEmpty();
        * */

    }
}
