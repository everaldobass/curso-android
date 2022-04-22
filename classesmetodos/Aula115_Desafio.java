package classesmetodos;

public class Aula115_Desafio {
    public static void main(String[] args) {
        Aula116_Comida c1 = new Aula116_Comida("Arroz", 0.180);
        Aula116_Comida c2 = new Aula116_Comida("Feijão", 0.300);

        Aula116_Pessoa p = new  Aula116_Pessoa("João", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);
    }
}
