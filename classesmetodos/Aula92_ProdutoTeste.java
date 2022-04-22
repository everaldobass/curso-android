package classesmetodos;

public class Aula92_ProdutoTeste {

    public static void main(String[] args) {

        Aula92_ClasseProduto p1 = new Aula92_ClasseProduto();
        p1.nome = "Notebook";
        p1.preco = 4000.00;
        p1.desconto = 0.25;

        var p2 = new Aula92_ClasseProduto();
        p2.nome = "Celular";
        p2.preco = 10.20;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
