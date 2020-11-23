package eCommerceApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveFile {

    private final File file;

    public SaveFile() {

        file = new File("text.txt");
        checkFile();

    }

    private void checkFile() {

        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void save(User user) {

        FileWriter fu = null;

        try {
            fu = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        PrintWriter pw = new PrintWriter(fu);

        pw.println("Name: " + user.getName() + "\n" + "Surname: " + user.getSurname() + "\n" +"Budget: " + user.getBudget());

        pw.close();

        System.out.println("Dobro dosli" + " " + user.getName());
        System.out.println("Popunite svoju korpu ispod ponudjenim proizvodima iz naseg asortimana!");

    }

}
