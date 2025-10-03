class Calculator {

    public void calculate(double side) {
        double area = side * side;
        System.out.println("Operation: Square Area");
        System.out.println("Side Length: " + side);
        System.out.println("Result: Area = " + area);
    }

    public void calculate(double length, double width) {
        double area = length * width;
        System.out.println("Operation: Rectangle Area");
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Result: Area = " + area);
    }

    public void calculate(double sideA, double sideB, long precision) {
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        System.out.println("Operation: Right Triangle Hypotenuse");
        System.out.println("Side A: " + sideA + ", Side B: " + sideB);
        System.out.println("Result: Hypotenuse = " + hypotenuse);
    }

    public void calculate(double principal, float rate, int time, boolean isAnnual) {
        double interest = principal * (rate / 100) * time;
        System.out.println("Operation: Simple Interest");
        System.out.println("Principal: " + principal + ", Rate: " + rate + "%, Time: " + time + " years");
        System.out.println("Interest Type (Annual): " + isAnnual);
        System.out.println("Result: Simple Interest = " + interest);
    }
}

