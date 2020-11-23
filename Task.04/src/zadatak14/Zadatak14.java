package zadatak14;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zadatak14 {

    public static void main(String[] args) {

        new Zadatak14();
    }

    public Zadatak14() {

        int godine = Integer.parseInt(JOptionPane.showInputDialog("Unesi godine"));

        if (godine <= 0) {

            JOptionPane.showMessageDialog(null, "Unesite ispravan broj godina");

        } else if (godine < 13 && godine > 0) {

            JOptionPane.showMessageDialog(null, "Vi ste junior");

        } else if (godine >= 13 && godine < 18) {

            JOptionPane.showMessageDialog(null, "Vi ste tinejdzer");

        } else {

            JOptionPane.showMessageDialog(null, "Vi ste punoletni");
        }
    }
;

}
