package ProgramaçãoPOO;

public class Aula141_CompraTeste {

    public static void main(String[] args) {

        Aula141_Compra c1 = new Aula141_Compra();
        c1.cliente = "Everaldo Nascimento";
        c1.itens.add(new Aula141_Item("Caneta", 20, 7, 7.45));
        c1.itens.add(new Aula141_Item("Caneta", 12, 7, 7.45));


        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

    }
}
