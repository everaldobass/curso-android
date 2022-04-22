package ProgramaçãoPOO;

import java.util.ArrayList;

public class Aula141_Compra {

    String cliente;
    ArrayList<Aula141_Item> itens = new ArrayList<Aula141_Item>();

    double obterValorTotal(){
        double total = 0;

        for(Aula141_Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;

    }

}
