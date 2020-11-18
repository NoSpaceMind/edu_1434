/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

public class Main {
    public static void main(String[] args) {
        // напишите тут ваш код
    }
}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nmbr = new ArrayList<>();
        ArrayList<Integer> nmbrs = new ArrayList<>();
        try {
            System.out.print("Введите путь к файлу: ");  //C://edu/test.txt
            String fileName = scan.nextLine();
            FileReader reader = new FileReader(fileName);
            int c;
            int cx;
            int lot = 1;
            String numbers = "";

            while ((c = reader.read()) != -1) {
                if (c == 13) {
                    numbers += ":";
                    lot++;
                } else if (c == 10)
                    numbers += "";
                else if (c == 45)
                    numbers += "-";
                else {
                    cx = Character.getNumericValue(c);
                    numbers += cx;
                }
            }

            nmbr.add(numbers);

            for (int j = 0; j < lot; j++) {
                String s = numbers.split(":")[j];
                int n = Integer.parseInt(s);
                if (n % 2 == 0)
                    nmbrs.add(n);
            }

            Collections.sort(nmbrs);
            //System.out.println(nmbrs);
            for (int i = 0; i < nmbrs.size(); i++) {
                System.out.println(nmbrs.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}
