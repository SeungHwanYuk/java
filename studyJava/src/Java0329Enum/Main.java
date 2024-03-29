package Java0329Enum;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99,Category.ELECTRONICS);
        System.out.println(product.getCategory());
    }
}
