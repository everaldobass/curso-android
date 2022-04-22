package classesmetodos;

public class Aula101_Desafio {

    int dia;
    int mes;
    int ano;

    Aula101_Desafio(){
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    Aula101_Desafio(int dataInicial, int mesInicial, int anoInicial){
        dia = dataInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterData(){
        return String.format("%d / %d / %d \n", dia, mes, ano);

    }

}
