package eCommerceApp;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<Product> products;
    private String name;
    private int id;
    private double price;

    public Product() {

        initProducts();
    }

    public Product(String name, double price, int id) {

        this.name = name;
        this.price = price;
        this.id = id;

    }

    private void initProducts() {

        this.products = new ArrayList<>();

        products.add(new Product("Samsung TV", 450.44, 1));
        products.add(new Product("Sony Headphones", 100.50, 2));
        products.add(new Product("ASUS Laptop", 350.00, 3));
        products.add(new Product("Genius PC Speakers", 110.45, 4));
        products.add(new Product("A4Tech Mouse", 60.00, 5));
        products.add(new Product("iPhone 11 Pro", 500.25, 6));

    }

    public void addToProduct(Product product) {

        products.add(product);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Redni broj: " + id + ", " + "Naziv robe: " + name + ", " + "Cena: " + price;
    }

}
