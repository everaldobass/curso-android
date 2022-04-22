package classesmetodos;

public class Aula99_Construtores {
        // Construtores
        // Construtor padrão fornecido pelo Java
        // Construtor não tem retorno
        String nome;
        double preco;
        double desconto;

        Aula99_Construtores(){

        }

        Aula99_Construtores(String nomeInicial, double precoInicial, double descontoInicial){
            nome = nomeInicial;
            preco = precoInicial;
            desconto = descontoInicial;
        }

    double precoDesconto(){
        return preco * (1 - desconto);
    }

}
