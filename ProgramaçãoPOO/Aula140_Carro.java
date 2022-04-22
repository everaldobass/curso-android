package ProgramaçãoPOO;

public class Aula140_Carro {

    Aula140_Motor motor = new Aula140_Motor();

    void acelerar(){
        motor.fatorInjecao += 0.4;
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estadoLigado(){
        return motor.ligado;
    }

}
