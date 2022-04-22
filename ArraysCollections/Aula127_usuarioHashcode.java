package ArraysCollections;

public class Aula127_usuarioHashcode {

    public static void main(String[] args) {

        Aula127_Equals u1 = new Aula127_Equals();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        Aula127_Equals u2 = new Aula127_Equals();
        u2.nome = "Jose da Silva";
        u2.email = "jose.silva@zemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
