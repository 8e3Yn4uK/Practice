package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human ch1 = new Human("Vasya", true, 7, null );
        Human ch2 = new Human("Vasya2", true, 8, null );
        Human ch3 = new Human("Vasya3", false, 9, null );


        Human mother = new Human("Yana", false, 31, ch1);
        Human father = new Human("Ivan", true, 35, ch2);


        Human ded1 = new Human("Panas", true, 78, father);
        Human baba1 = new Human("panaska", false, 73, father);
        Human ded2 = new Human("Irod", true, 91, mother);
        Human baba2 = new Human("Nastya", false, 79, mother);
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(ch1);
        family.add(ch2);
        family.add(ch3);
        family.add(father);
        family.add(mother);
        family.add(ded1);
        family.add(ded2);
        family.add(baba1);
        family.add(baba2);
        for (Human humy : family)
        {
            System.out.println(humy.toString());
        }

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
        public Human(String name, boolean sex, int age, Human human){
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (human!=null) children.add(human);
            else this.children = new ArrayList<Human>();
        }
    }

}
