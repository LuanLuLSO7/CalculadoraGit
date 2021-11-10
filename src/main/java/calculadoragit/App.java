
package calculadoragit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {      
       
        
        
         Scanner scn= new Scanner(System.in);
        
        System.out.println("Digite o valor de x: ");
        CalculadoraGit.setX(scn.nextInt());
        System.out.println("Digite o valor de y: ");
        CalculadoraGit.setY(scn.nextInt());
        System.out.println("");
        
        CalculadoraGit.soma();
        CalculadoraGit.subtracao();
        CalculadoraGit.multiplicacao();
        CalculadoraGit.divisao();
    }
}
