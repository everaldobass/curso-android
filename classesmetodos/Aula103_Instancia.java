package classesmetodos;

public class Aula103_Instancia {
    double raio;
    // Define o valor na classe
    static final double PI = 3.1415;

    Aula103_Instancia(double raioInicial){
        //pi = 3.14;
        raio = raioInicial;
    }

    double area(){
        //Math metodo statico
        return PI * Math.pow(raio, 2);
    }
}
