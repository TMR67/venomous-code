class Thunder {
    public static int id;
    public static String name;
    public static long density;
    public static float height;
    public static double area;
    public static char typeCode;
    public static boolean rains;

    public Thunder(int id, String name, long density, float height, double area, char typeCode, boolean rains) {
        System.out.println("first try = " + this.id);
        System.out.println("first try = " + this.name);
        System.out.println("first try = " + this.density);
        System.out.println("first try = " + this.height);
        System.out.println("first try = " + this.area);
        System.out.println("first try = " + this.typeCode);
        System.out.println("first try = " + this.rains);

        this.id = id;
        this.name = name;
        this.density = density;
        this.height = height;
        this.area = area;
        this.typeCode = typeCode;
        this.rains = rains;

        System.out.println("second try = " + this.id);
        System.out.println("second try = " + this.name);
        System.out.println("second try = " + this.density);
        System.out.println("second try = " + this.height);
        System.out.println("second try = " + this.area);
        System.out.println("second try = " + this.typeCode);
        System.out.println("second try = " + this.rains);
    }
}