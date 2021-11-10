package calculadoragit;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {      
       
        Scanner scn= new Scanner(System.in);
        CalculadoraGit calc1 = new CalculadoraGit();
        CalculadoraGit calc2 = new CalculadoraGit();
        
        System.out.println("Digite o valor de x para calc1: ");
        calc1.setX(scn.nextInt());
        System.out.println("Digite o valor de y para calc1: ");
        calc1.setY(scn.nextInt());
        System.out.println("");
        
        System.out.println("Digite o valor de x para calc2: ");
        calc2.setX(scn.nextInt());
        System.out.println("Digite o valor de y para calc2: ");
        calc2.setY(scn.nextInt());
        
        System.out.println("");
        System.out.println("-------------------- calc 1 --------------------\n\n");
        
        calc1.soma();
        calc1.subtracao();
        calc1.multiplicacao();
        calc1.divisao();
        
        System.out.println("");
        System.out.println("-------------------- calc 2 --------------------\n\n");
        
        calc2.soma();
        calc2.subtracao();
        calc2.multiplicacao();
        calc2.divisao();
        
        //System.out.println("Soma= "+ calc.soma(44, 99) + "\n");
        //System.out.println("Subtração= "+ calc.subtracao(12, -5) + "\n");
        //System.out.println("Multiplicação= "+ calc.multiplicacao(13, 13) + "\n");
        //System.out.println("Divisão= "+  calc.divisao(10, 5) + "\n");
        
    }
}
