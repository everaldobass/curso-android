package classesmetodos;

public class Aula111_this {


    int dia;
    int mes;
    int ano;

    Aula111_this(){
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    Aula111_this(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData(){
        return String.format("%d / %d / %d \n", dia, mes, ano);

    }
}
