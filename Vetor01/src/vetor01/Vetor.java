package vetor01;

import java.util.Arrays;

public class Vetor {
    
    public static void main(String[] args) {
        int n[]={3,2,5,6,8,78};
        int[] d ={3,2,5,6,8};
        int te[]=new int[9];
        Arrays.fill(te,1 0);
        
        for( int valor: te){
            System.out.println(valor);
        }
        
        System.out.println(n.length);
        for (int c=0;c<=5;c++){
            System.out.println(n[c]);
        }
        
        
        String mes[]={"jan","Fev","Mar","Abr","Maio","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i=0; i < mes.length;i++){
            System.out.println("O mes " + mes[i] + " tem " + tot[i] + "dias");
        }
        
        
        double v[]={23.6,36,6.9};
        Arrays.sort(v);
        
        for (double valor: v){
            System.out.println(valor);
        }
        
        int pos=Arrays.binarySearch(v, 36);
        System.out.println(pos);
     
        
        
        
       
    }

}
