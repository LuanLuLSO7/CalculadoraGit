package calculadoragit;

import java.util.Scanner;

public class CalculadoraGit {

    static int x, y;
    static int soma;
    static int subtracao;
    static int multiplicacao;
    static float divisao;
            
    public static void soma(){
        soma=x+y;
        System.out.println("Soma= "+ soma + "\n");
    }
    
    public static void subtracao(){
        subtracao=x-y;
        System.out.println("Subtração= "+ subtracao  + "\n");
    }
    
    public static void multiplicacao(){
        multiplicacao=x*y;
        System.out.println("Multiplicação= "+ multiplicacao + "\n");
    }
    
    public static void divisao(){
        divisao=(float)x/y;
        System.out.println("Divisão= "+ divisao + "\n");
    }
   
    public static void main(String[] args) {      
       
        Scanner scn= new Scanner(System.in);
        
        System.out.println("Digite o valor de x: ");
        x=scn.nextInt();
        System.out.println("Digite o valor de y: ");
        y=scn.nextInt();
        
        System.out.println("");
        
        soma();
        subtracao();
        multiplicacao();
        divisao();
    }
    
}
