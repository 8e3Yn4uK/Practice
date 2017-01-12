package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("man1", 31, "kiev");
        Man man2 = new Man("man2", 25, "kiev");
        Woman woman1 = new Woman("woman1", 21, "kiev");
        Woman woman2 = new Woman("woman2", 31, "kiev");
        System.out.println("name " + man1.name + " age " + man1.age + " address " + man1.address);
        System.out.println("name " + man2.name + " age " + man2.age + " address " + man2.address);
        System.out.println("name " + woman1.name + " age " + woman1.age + " address " + woman1.address);
        System.out.println("name " + woman2.name + " age " + woman2.age + " address " + woman2.address);
    }

    public static class Man{
    String name;
    int age;
    String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
