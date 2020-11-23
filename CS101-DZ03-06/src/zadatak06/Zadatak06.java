package zadatak06;

import javax.swing.JOptionPane;

public class Zadatak06 {

    public static void main(String[] args) {
        
        new Zadatak06();
    }

    public Zadatak06() {

        double broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

        double noviBroj;

        double neparniNoviBroj;

        if (broj % 2 == 0) {

            noviBroj = broj / 3;

            JOptionPane.showMessageDialog(null, "Broj je paran" + ", a rezultat deljenja sa 3 je " + noviBroj + ".");
        } else {

            neparniNoviBroj = broj / 5;

            JOptionPane.showMessageDialog(null, "Broj je neparan" + ", a rezultat deljenja sa 5 je " + neparniNoviBroj + ".");
        };

    }
;
}
