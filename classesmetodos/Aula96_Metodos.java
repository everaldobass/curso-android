package classesmetodos;

public class Aula96_Metodos {

    String nome;
    double preco;
    double desconto;

    // Método sem parametro
    double precoDesconto(){

        return preco * (1 - desconto);
    }
}
