//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name1 = "John Doe";
        String name2 = "Jone Doe";

        greetStudent(name1);
        greetStudent(name2);

//        boolean test = isEven(20);
//        System.out.println(test);
        System.out.println(multiply(5,3));

        // Level 1
        System.out.println();
        System.out.println("------------Level 1---------------");
        System.out.println();
        printHello();
        System.out.println(getGreeting());
        printName("Yaroslava");

        // Level 2
        System.out.println();
        System.out.println("------------Level 2---------------");
        System.out.println();

        int add = add(3, 2);
        System.out.println(add);

        checkPositive(-8);

        // Level 3
        System.out.println();
        System.out.println("------------Level 3---------------");
        System.out.println();

        printSumMessage();
        printSumMessage(12, 35);

        System.out.println();
        System.out.println("----------------Taschenrechner--------------");

        Taschenrechner taschenrechner = new Taschenrechner();
        System.out.println("Add: " + taschenrechner.add(3, 5));
        System.out.println("Multiply: " + taschenrechner.multiply(5, 7));
        System.out.println("Subtract: " + taschenrechner.subtract(8, 3556));
        System.out.println("Divide: " + taschenrechner.divide(3, 0));
    }

    // scope (static) RückgabeTyp name (ÜbergabeParameter) {}
    public static void greetStudent(String name) {
        System.out.println("Hello, " + name + " wie geht es dir?");
        System.out.println("Willkommen");

    }

//    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void printHello() {
        System.out.println("Hello Welt!");
    }

    public static String getGreeting() {
        return "Willkommen im Java-Kurs";
    }

    public static void printName(String name) {
        System.out.println("Hallo " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void checkPositive(int number) {
        if (number < 0)  {
            System.out.println("Negative Zahl");
            return;
        }
        System.out.println("It will not be printed  if the number is negative");
    }

    public static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printSumMessage() {
        System.out.println(add(3,8));
    }

    public static void printSumMessage(int a, int b) {
        int sum = add(a, b);
        System.out.printf("Your sum is %d%n", sum);
    }


}