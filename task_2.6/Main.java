/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;
            if(a%b == 0) {
                System.out.println("Число  делится без остатка ");
            }
            else if(a%b != 0)
            {
                int difference = a%b;
                System.out.println("Число  делится с остатком. Остаток: " + difference);
            }
     }
}
