package classesmetodos;

public class Aula104_Circonferencia {
    public static void main(String[] args) {

        Aula103_Instancia a1 = new Aula103_Instancia(10);
        //a1.pi = 10;

        Aula103_Instancia a2 = new Aula103_Instancia(5);
        //a2.pi = 10;

        //Aula103_Instancia.pi = 3.1415;

        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(Math.PI);
    }
}
