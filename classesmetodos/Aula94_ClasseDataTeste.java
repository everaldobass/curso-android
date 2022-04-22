package classesmetodos;

public class Aula94_ClasseDataTeste {

    public static void main(String[] args) {

        Aula93_ClasseData d1 = new Aula93_ClasseData();
        d1.dia = 18;
        d1.mes = 03;
        d1.ano = 2022;

        System.out.printf("%d,%d,%d\n", d1.dia, d1.mes, d1.ano);

        var d2 = new Aula93_ClasseData();
        d2.dia = 20;
        d2.mes = 03;
        d2.ano = 2022;

        System.out.printf("%d,%d,%d\n", d2.dia, d2.mes, d2.ano);
    }

}
