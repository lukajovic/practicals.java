package eCommerceApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final SaveFile saveFile;
    private final Scanner sc;
    private final Product product;
    private User korisnik;
    private ArrayList<Integer> listaInt = new ArrayList();
    private ArrayList<Product> cart;

    public Menu() {

        product = new Product();
        saveFile = new SaveFile();
        sc = new Scanner(System.in);
        listaInt = new ArrayList();

        mainMenu();

    }

    private void mainMenu() {

        System.out.println("Dobro dosli u vasu eCommerce aplikaciju!");
        programRegister();

    }

    public void programRegister() {

        System.out.println("Unesite ime: ");
        String name = sc.next();
        System.out.println("Unesite prezime: ");
        String surname = sc.next();
        System.out.println("Unesite vas budzet u evrima: ");
        int budget = sc.nextInt();
        korisnik = new User(name, surname, budget);
        saveFile.save(korisnik);
        shopping();

    }

    private void shopping() {

        ArrayList<Product> lista = (ArrayList<Product>) product.getProducts();

        lista.forEach((productElement) -> {

            System.out.println(productElement.toString());

        });

        System.out.println("Da bi ste izabrali zeljeni proizvod unestie njegov REDNI broj");
        System.out.println("Za prekid unosenja proizvoda u korpu i placanje vaseg racuna - pritisnite taster q");

        while (true) {

            String input = sc.next();

            if (input.equals("q")) {

                printBill();
                break;

            } else {

                listaInt.add(Integer.parseInt(input));

            }

        }

    }

    public void printBill() {

        ArrayList<Product> listOfProducts = (ArrayList<Product>) product.getProducts();
        cart = new ArrayList<>();

        listOfProducts.forEach(product -> {

            listaInt.forEach(i -> {

                if (product.getId() == i) {

                    cart.add(product);

                }

            });

        });

        System.out.println("Vasa korpa je sadrzi sledece proizvode");

        final double price[] = new double[1];

        cart.forEach(element -> {

            System.out.println("Naziv : " + element.getName() + ", Cena : " + element.getPrice() + " eur.");
            price[0] += element.getPrice();

        });

        System.out.println("Vasa konacna cena iznosi " + price[0] + " eur.");
        payBill(price[0]);
    }

    public void payBill(double price) {

        System.out.println("Za racun unesite 1, povratak u kupovinu unesite 2");

        int input = sc.nextInt();

        if (input == 1) {

            double budget = korisnik.getBudget();

            if (budget >= price) {

                System.out.println("Uspesno ste izvrsili kupovinu!");
                double d = budget - price;
                korisnik.setBudget(d);
                System.out.println("Vas preostali budzet je " + d + " eur.");
                continueShopping();

            } else {
                System.out.println("Nemate dovoljno novca da izvrsite kupovinu! Izabreite ponovo u skladu sa vasim budzetom!");
                shopping();
            }

        } else {
            shopping();
        }

    }

    private void continueShopping() {

        System.out.println("Uspesno ste kupili sledece proizvode");

        cart.forEach(element -> {

            System.out.print(element.getName() + " ");

        });

        System.out.println("\nZa nastavak kupovine pritisnite 1! Za izlazak iz aplikacije pritistine 2!");

        int input = sc.nextInt();

        if (input == 1) {

            shopping();

        } else if (input == 2) {

            System.out.println("Uspesno ste iazasli iz vase eCommerce aplikacije!");
            System.out.println("Dodjite nam ponovo!");

            System.exit(0);

        }

    }

}
