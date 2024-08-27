class Product {
    protected String productId;
    protected String productName;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public void updateStock(int quantity) {
        this.stockQuantity += quantity;
        System.out.println("Stock updated. New quantity: " + stockQuantity);
    }
}

class Electronics extends Product {
    private int warrantyInMonths;

    public Electronics(String productId, String productName, double price, int stockQuantity, int warrantyInMonths) {
        super(productId, productName, price, stockQuantity);
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty: " + warrantyInMonths + " months");
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String productId, String productName, double price, int stockQuantity, String size) {
        super(productId, productName, price, stockQuantity);
        this.size = size;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
    }
}

class Grocery extends Product {
    private String expirationDate;

    public Grocery(String productId, String productName, double price, int stockQuantity, String expirationDate) {
        super(productId, productName, price, stockQuantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

public class a1 {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("E101", "Laptop", 999.99, 10, 24);
        Clothing shirt = new Clothing("C202", "Shirt", 29.99, 50, "M");
        Grocery apple = new Grocery("G303", "Apple", 0.99, 100, "2024-12-31");

        laptop.displayProductDetails();
        System.out.println();
        shirt.displayProductDetails();
        System.out.println();
        apple.displayProductDetails();
    }
}
