package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Ola mundo","Boas vindas",JOptionPane.ERROR_MESSAGE);
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Infomr N|umero"));
        //JOptionPane.showMessageDialog(null, "vc digitou " + n);       
        int n;
        int r=0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "<html>Infomre um numero <br> <em>(valor 0 interrompe)<em> <br><br>"
                                + "Soma é " + r
                                + "</html>"));
            r+=n;
        } while (n != 0);
    }
}
