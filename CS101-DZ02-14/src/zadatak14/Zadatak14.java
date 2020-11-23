package zadatak14;

import javax.swing.JOptionPane;

public class Zadatak14 {

    public static void main(String[] args) {
        
        int pocetniBudzet = Integer.parseInt(JOptionPane.showInputDialog("Unesi svoj budzet"));
        
        int prviArtikal = Integer.parseInt(JOptionPane.showInputDialog("Prvi artikal"));
        
        int drugiArtikal = Integer.parseInt(JOptionPane.showInputDialog("Drugi artikal"));
        
        int treciArtikal = Integer.parseInt(JOptionPane.showInputDialog("Treci artikal"));
        
        int cetvrtiArtikal = Integer.parseInt(JOptionPane.showInputDialog("Cetvrti artikal"));
        
        int ostatak = pocetniBudzet - (prviArtikal + drugiArtikal + treciArtikal + cetvrtiArtikal);
        
        JOptionPane.showMessageDialog(null, "Preostali budzet za ovu nedelju vam sada iznosi" + " " + ostatak + " dinara.");
    }

}
