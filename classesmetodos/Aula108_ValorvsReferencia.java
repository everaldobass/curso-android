package classesmetodos;

public class Aula108_ValorvsReferencia {

    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor  -  tipo primitivo

        a++;
        b--;

        System.out.println(a + "" + b);

        Aula97_DesafioData d1 = new Aula97_DesafioData();
        Aula97_DesafioData d2 = d1; // Atribuição por referência

        d1.dia = 21;
        d2.mes = 03;

        d1.ano = 2022;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());
    }
}
