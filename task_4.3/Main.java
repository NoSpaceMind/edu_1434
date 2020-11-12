/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat gatCat = new Cat();
        Cat jofCat = new Cat();
        gatCat.age = 13;
        gatCat.weight = 8;
        gatCat.strength = 52;
        jofCat.age = 11;
        jofCat.weight = 7;
        jofCat.strength = 55;


        System.out.println(gatCat.fight(jofCat));
        System.out.println(jofCat.fight(gatCat));
    }
}

class Cat {
    public int age;         //возраст
    public int weight;      // вес
    public int strength;    // сила

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
       int catWinner =0;
       if (this.age > anotherCat.age)
           catWinner++;
        else catWinner--;
        if (this.weight > anotherCat.weight)
            catWinner++;
        else catWinner--;
        if (this.strength > anotherCat.strength)
            catWinner++;
        else catWinner--;
        if (catWinner>0) return true;
        else return false;
    }
}
