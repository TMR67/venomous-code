class Dragon {
    public Dragon() {
        this("Thunder");
    }

    public Dragon(String name) {
        this(name, "Fire Dragon");
    }

    public Dragon(String name, String type) {
        this(name, type, 500);
    }

    public Dragon(String name, String type, int age) {
        this(name, type, age, "Red");
    }

    public Dragon(String name, String type, int age, String color) {
        this(name, type, age, color, 60.5f);
    }

    public Dragon(String name, String type, int age, String color, float wingSpan) {
        this(name, type, age, color, wingSpan, 10000.0);
    }

    public Dragon(String name, String type, int age, String color, float wingSpan, double treasureValue) {
        this(name, type, age, color, wingSpan, treasureValue, true);
    }

    public Dragon(String name, String type, int age, String color, float wingSpan, double treasureValue, boolean canBreatheFire) {
        System.out.println("==== Dragon Details ====");
        System.out.println("Name = " + name);
        System.out.println("Type = " + type);
        System.out.println("Age = " + age + " years");
        System.out.println("Color = " + color);
        System.out.println("Wing Span = " + wingSpan + " meters");
        System.out.println("Treasure Hoard Value = ₹" + treasureValue);
        System.out.println("Can Breathe Fire = " + canBreatheFire);
    }
}
