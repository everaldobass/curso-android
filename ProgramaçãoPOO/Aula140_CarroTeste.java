package ProgramaçãoPOO;

public class Aula140_CarroTeste {

   public static void main(String[] args) {

      Aula140_Carro c1 = new Aula140_Carro();
      System.out.println(c1.estadoLigado());

      c1.ligar();
      System.out.println(c1.estadoLigado());

      System.out.println(c1.motor.giros());
      c1.acelerar();
      c1.acelerar();
      c1.acelerar();
      System.out.println(c1.motor.giros());

      c1.frear();
      c1.frear();
      System.out.println(c1.motor.giros());

   }

}
