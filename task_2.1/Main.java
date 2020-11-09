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
        System.out.println(twister[0]+twister[1]+twister[2]);
        System.out.println(twister[0]+twister[2]+twister[1]);
        System.out.println(twister[1]+twister[0]+twister[2]);
        System.out.println(twister[1]+twister[2]+twister[0]);
        System.out.println(twister[2]+twister[0]+twister[1]);
        System.out.println(twister[2]+twister[1]+twister[2]);
    }
}
