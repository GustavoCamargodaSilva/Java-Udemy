package entities;

public class products2 {

    private String name;
    private double price;
    private int quantity;

    public products2(String name, double price, int quantity) {
        this.name = name; // construtor
        this.price = price;
        this.quantity = quantity;
    }

    public products2(String name, double price) {
        this.name = name; // construtor sobrecarga
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price; // acessar o preço do produto
    }

    public void setPrice(double price) {
        this.price = price; // Alterar o preço do produto
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
