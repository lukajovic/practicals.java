package zadatak14;

import javax.swing.JOptionPane;

public class Zadatak14 {

    public static void main(String[] args) {
        
        new Zadatak14();
    }

    public Zadatak14() {
        
        String input = JOptionPane.showInputDialog("Unesi rec");

        if (input.length() < 3) {
            
            JOptionPane.showMessageDialog(null, "Unesi rec sa vise od 3 slova");
        }
        
        char[] array = input.toCharArray();
        
        int[] myArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            char character = array[i];
            
            int ascii = (int) character;
            
            myArray[i] = ascii;

        }

        int a[] = new int[myArray.length];
        
        int sum = 0;

        for (int y = 0; y < myArray.length; y++) {
            
            sum += myArray[y];
        }

        int zbir = myArray[0] + myArray[1] + myArray[2];

        if (zbir % 2 == 0) {

            String noviString = input.substring(input.length() - 1) + input.substring(1, input.length() - 1) + input.substring(0, 1);
            
            JOptionPane.showMessageDialog(null, noviString + " " + noviString);

        } else if (zbir % 3 == 0) {

            JOptionPane.showMessageDialog(null, input + " " + input + " " + input);
        }
        
        JOptionPane.showMessageDialog(null,"Suma je " + sum);

    }
};
