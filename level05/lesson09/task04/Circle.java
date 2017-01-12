package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX, centerY, readius, width;
    String color;

    public Circle(int centerX, int centerY, int readius, int width, String color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.readius = readius;
        this.width = width;
        this.color = color;
    }

    public Circle(int centerX, int centerY, int readius, int width)
    {

        this.centerX = centerX;
        this.centerY = centerY;
        this.readius = readius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int readius)
    {

        this.centerX = centerX;
        this.centerY = centerY;
        this.readius = readius;
    }
}
