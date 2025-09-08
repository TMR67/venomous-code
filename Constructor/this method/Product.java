class Product {
    public static int productId;
    public static String productName;
    public static long stock;
    public static float weight;
    public static double price;
    public static char category;
    public static boolean inStock;

    public Product(int productId, String productName, long stock, float weight, double price, char category, boolean inStock) {
        System.out.println("first try = " + this.productId);
        System.out.println("first try = " + this.productName);
        System.out.println("first try = " + this.stock);
        System.out.println("first try = " + this.weight);
        System.out.println("first try = " + this.price);
        System.out.println("first try = " + this.category);
        System.out.println("first try = " + this.inStock);

        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.weight = weight;
        this.price = price;
        this.category = category;
        this.inStock = inStock;

        System.out.println("second try = " + this.productId);
        System.out.println("second try = " + this.productName);
        System.out.println("second try = " + this.stock);
        System.out.println("second try = " + this.weight);
        System.out.println("second try = " + this.price);
        System.out.println("second try = " + this.category);
        System.out.println("second try = " + this.inStock);
    }
}