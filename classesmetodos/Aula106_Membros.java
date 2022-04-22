package classesmetodos;

public class Aula106_Membros {

    public static void main(String[] args) {

        // Produto 1
        Aula105_Desafio p1 = new Aula105_Desafio();
        p1.nome = "Notebook";
        p1.preco = 4000.00;
        //p1.desconto = 0.25;
        Aula105_Desafio.desconto = 0.25;

        // Produto 2
        var p2 = new  Aula105_Desafio();
        p2.nome = "Celular";
        p2.preco = 10.20;
       // p2.desconto = 0.29;
        Aula105_Desafio.desconto = 0.29;

        System.out.println(p1.nome + " " + p1.precoDesconto());
        System.out.println(p2.nome + " " + p2.precoDesconto());

        // Chamando os métodos
        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf(" Média final = R$%.2f  ", mediaCarrinho);
    }
}
