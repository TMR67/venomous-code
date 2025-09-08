class Gadget {
    public static int gadgetId;
    public static String gadgetName;
    public static long storage;
    public static float size;
    public static double price;
    public static char typeCode;
    public static boolean wireless;

    public Gadget(int gadgetId, String gadgetName, long storage, float size, double price, char typeCode, boolean wireless) {
        System.out.println("first try = " + this.gadgetId);
        System.out.println("first try = " + this.gadgetName);
        System.out.println("first try = " + this.storage);
        System.out.println("first try = " + this.size);
        System.out.println("first try = " + this.price);
        System.out.println("first try = " + this.typeCode);
        System.out.println("first try = " + this.wireless);

        this.gadgetId = gadgetId;
        this.gadgetName = gadgetName;
        this.storage = storage;
        this.size = size;
        this.price = price;
        this.typeCode = typeCode;
        this.wireless = wireless;

        System.out.println("second try = " + this.gadgetId);
        System.out.println("second try = " + this.gadgetName);
        System.out.println("second try = " + this.storage);
        System.out.println("second try = " + this.size);
        System.out.println("second try = " + this.price);
        System.out.println("second try = " + this.typeCode);
        System.out.println("second try = " + this.wireless);
    }
}