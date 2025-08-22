public class Taschenrechner {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("You made a huge mistake🤯");
            System.out.println("💥💥💥💥💥The world exploded💥💥💥💥💥");
            return Double.NaN;
        }
        return a / b;
    }
}
