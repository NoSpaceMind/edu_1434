/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String twister[] = {"Мама","Мыла","Раму"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    if (i==j)
                        continue;
                        if (j==k)
                            continue;
                            if (k==i)
                                continue;
                    System.out.print(twister[i]);
                    System.out.print(twister[j]);
                    System.out.print(twister[k]);
                    System.out.println();
                }
            }
        }
    }
}
