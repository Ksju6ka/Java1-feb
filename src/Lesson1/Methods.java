package Lesson1;

public class Methods {

    static void helloWorldPrinter() {
        System.out.println("Hello World");
    }

    static void sqrtEquation(double a, double b,double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Корней нет");
        } else if (discriminant == 0) {
            System.out.println("Eдинственный корень x = " + (-b / (2 * a)));
        } else {
            System.out.println("Два корня");
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 =" +x1);
            System.out.println("x2 =" +x2);
        }
    }

    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        helloWorldPrinter();
        sqrtEquation(1,5,6);
        System.out.println(sum(1,2));

    }
}
