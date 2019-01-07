package exerciciodate;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class ExercicioDate {
    public static void main(String[] args) {
       Date data= new Date();
        System.out.println("Hora atual: " + data.toString());
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d= tk.getScreenSize();
        
        System.out.println("Screen width: " + d.width);
        System.out.println("Screen heeigh: " + d.height);
        
                
       
       
               
    }
    
}
