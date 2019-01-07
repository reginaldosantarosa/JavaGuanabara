package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {    
    public static void main(String[] args) {
       float nota = 8.5f;
       String nome= "gustava";
       System.out.println("Sua nota e: " + nota);
       System.out.printf("Sua nota e: %.2f \n ", nota);
       System.out.printf("Sua nota de %s e: %.2f \n ", nome,nota);
       System.out.format("Sua nota de %s e: %.2f \n ", nome,nota);
       
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Digite nome: ");
       String nome2= teclado.nextLine();
        System.out.print("Digite nota: ");  
       float nota2=teclado.nextFloat();
       
       System.out.format("Sua nota de %s e: %.2f \n ", nome2,nota2);
       double PI = Math.PI;
       System.out.println(PI);
       
       
       
       
       
    }
    
    
}
