package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        int date = Integer.parseInt(rdr.readLine());
        String name = rdr.readLine();
        System.out.println(name + " " + "захватит мир через" + " " + date + " " + "лет. Му-ха-ха!");

    }
}