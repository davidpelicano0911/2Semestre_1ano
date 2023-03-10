class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    // TODO: completar implementação da classe


    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product p){
        if (count >= products.length) {
            System.out.println("A caixa registradora está cheia!");
            return;
        }
        products[count++] = p;
    }

    public void listProducts() {
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Product", "Price", "Quantity", "Total");
        double total = 0;
        for (Product p : products) {
            if (p != null) {
                System.out.printf("%-15s %-15.2f %-15d %-15.2f\n", p.getName(), p.getPrice(), p.getQuantity(), p.getTotalValue());
                total += p.getTotalValue();
            }
        }
        
    }
    
    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getTotalValue();
            }
        }
        return total;
    }

}


public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        // TODO: Listar o conteúdo e valor total
        cr.listProducts();
        System.out.println("Total value: " + cr.getTotal());

    }
}