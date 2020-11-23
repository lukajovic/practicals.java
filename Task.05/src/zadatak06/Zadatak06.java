package zadatak06;

import javax.swing.JOptionPane;

public class Zadatak06 {

    public static void main(String[] args) {
        new Zadatak06();
    }

    public Zadatak06() {

        int input = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

        int suma = 0;

        int brojac = 0;

        while (input != 0) {
            
            suma += input;
            
            brojac++;
            
            input = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

        };
        
        JOptionPane.showMessageDialog(null, "Suma je: " + suma);
    }
;
}
