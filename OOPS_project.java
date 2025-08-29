import java.util.*;

class OnlineMarket {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        Subsorv s = new Subsorv(); 

        System.out.println("Welcome");

        while (f == 0) {
            System.out.println("_");
            System.out.println("1. To sell products");
            System.out.println("2. To purchase products");
            System.out.println("3. Exit");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter contact details:");
                    String phone = sc.next();
                    System.out.println("Enter Product details:");
                    String product = sc.next();
                    System.out.println("Price:");
                    Long price = sc.nextLong();

                    s.insert(name, phone, product, price);
                    break;

                case 2:
                    s.View();  // show products available
                    break;

                case 3:
                    f = 1;
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }
}

class Product {
    String name;
    String phone;
    String productName;
    Long price;

    Product(String name, String phone, String productName, Long price) {
        this.name = name;
        this.phone = phone;
        this.productName = productName;
        this.price = price;
    }
}

abstract class Sellorview {
    abstract void View();
}

class Subsorv extends Sellorview {
    ArrayList<Product> products = new ArrayList<>();  // store all products

    void insert(String n, String phone, String product, Long price) {
        Product p = new Product(n, phone, product, price);
        products.add(p);
        System.out.println("✅ Product inserted successfully!");
    }

    @Override
    void View() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("\n--- Available Products ---");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.println((i + 1) + ". " + p.productName + " | Price: " + p.price + 
                                   " | Seller: " + p.name + " | Contact: " + p.phone);
            }
            System.out.println("---------------------------\n");
        }
    }
}
