import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какова сейчас температура в градусах Цельсия ???" );
        double tempС = scan.nextDouble();
        double tempF = (9.0/5) * tempС + 32;
        System.out.println("В градусах Фаренгейта: " + tempF);
    }
}
