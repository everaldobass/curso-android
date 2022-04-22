package classesmetodos;

public class Aula116_Pessoa {
    String nome;
    double peso;

    Aula116_Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Aula116_Comida comida){
        if(comida != null){

            this.peso += comida.peso;

        }
    }

    String apresentar(){
        return "Olá sou a pessoa " + nome   + " Tenho " + peso + " kgs";
    }

}
