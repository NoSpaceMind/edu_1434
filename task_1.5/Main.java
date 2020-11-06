import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempС = scan.nextInt();
        double tempF = 1.8 * tempС + 32;
        System.out.println("В градусах Фаренгейта: " + tempF);
    }
}
