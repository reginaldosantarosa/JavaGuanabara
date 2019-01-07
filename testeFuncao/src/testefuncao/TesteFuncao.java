package testefuncao;

public class TesteFuncao {
        
    static void soma(int a, int b){
        int s=a+b;
        System.out.println("A soma e " + s);
     
    }
    static int soma2(int a, int b){
        int s=a+b;
        System.out.println("A soma e " + s);
        return s;
    }
    public static  void main(String[] args) {
       soma(5,2);
       int r = soma2(5,2);
       System.out.println(r);
    }

}
