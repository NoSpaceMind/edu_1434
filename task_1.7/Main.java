import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры вашего бассейна (a × b × c) ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Для наполнения бассейна необходимо: " + a * b * c * 1000 + " литров воды"); //  1м3 воды = 1000л
    }
}
