import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempС = scan.nextInt();
        double tempF = (9.0/5) * tempС + 32;
        System.out.println("В градусах Фаренгейта: " + tempF);
    }
}
