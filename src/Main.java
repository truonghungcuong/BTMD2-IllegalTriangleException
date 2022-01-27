import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Triangle triangle;

        try {
            triangle = new Triangle(a, b, c);
            System.out.printf("Diện tích: %.2f, Chu vi: %.2f\n", triangle.getArea(), triangle.getPerimeter());
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }


    }
}