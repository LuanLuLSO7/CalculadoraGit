package calculadoragit;

public class CalculadoraGit {

    private int x, y;
    private int soma;
    private int subtracao;
    private int multiplicacao;
    private float divisao; 
    
    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
            
    public void soma(){
        soma=x+y;
        System.out.println("Soma= "+ soma + "\n");
    }
    
    public int soma(int x, int y){
        int soma=x+y;
        return soma;
    }
    
    public void subtracao(){
        subtracao=x-y;
        System.out.println("Subtração= "+ subtracao + "\n");
    }
    
    public int subtracao(int x, int y){
        int subtracao=x-y;
        return subtracao;
    }
     
    public void multiplicacao(){
        multiplicacao=x*y;
        System.out.println("Multiplicação= "+ multiplicacao + "\n");
    }
    
    public int multiplicacao(int x, int y){
        int multiplicacao=x*y;
       return multiplicacao;
    }
    
    public void divisao(){
        divisao=(float)x/y;
        System.out.println("Divisão= "+ divisao + "\n");
    }
    
    public float divisao(int x, int y){
        float divisao=(float)x/y;
        return divisao;
    }
    
}
