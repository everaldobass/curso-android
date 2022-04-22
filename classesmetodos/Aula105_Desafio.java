package classesmetodos;

public class Aula105_Desafio {
    String nome;
    double preco;
    static double desconto = 0.25;

    //Construtor padrão
    Aula105_Desafio(){

    }
    //
    Aula105_Desafio(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    // Método sem parametro
    double precoDesconto(){

        return preco * (1 - desconto);

     }

}
