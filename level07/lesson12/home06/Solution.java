package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Panas", true, 81, null, null);
        Human ded2 = new Human("Ivan", true, 77, null, null);
        Human baba1 = new Human("Inna", false, 65, null, null);
        Human baba2 = new Human("Parasha", false, 69, null, null);
        Human papa = new Human("Roman", true, 45, ded1.name, baba1.name);
        Human mama = new Human("Zoya", false, 38, ded2.name, baba2.name);
        Human ch1 = new Human("Ira", false, 8, papa.name, mama.name);
        Human ch2 = new Human("Inga", false, 10, papa.name, mama.name);
        Human ch3 = new Human("Jora", true, 18, papa.name, mama.name);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        String father;
        String mother;

        public Human(String name, boolean sex, int age, String father, String mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }
    }

}
