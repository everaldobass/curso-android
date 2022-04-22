package estruturasdecontroles;
import javax.swing.JOptionPane;

public class Aula65_ifelse {

    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog(
            "Informe um número: "
        );

        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){

            System.out.println("Número Par: " + numero);
        } else {

             System.out.println("Número Ímpar: " + numero);
        }      
    }
    
}
