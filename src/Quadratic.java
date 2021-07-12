import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value a");
        int a = s.nextInt();
        System.out.println("Enter value b");
        int b = s.nextInt();
        System.out.println("Enter value c");
        int c = s.nextInt();
        double root1, root2;

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("root1 and root2 are:: " + root1 + " " + 1root2);
        }
    }
}