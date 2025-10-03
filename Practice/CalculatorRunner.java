class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.calculate(5000.0, 5.5f, 3, true);

        System.out.println("\n--- Other Calculations ---");
        
        calculator.calculate(10.0, 5.0);
    }
}