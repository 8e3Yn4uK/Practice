package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> res1 = new ArrayList<String>();
        ArrayList<String> res2 = new ArrayList<String>();
        ArrayList<String> res3 = new ArrayList<String>();
        for (int i = 0; i < n; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size();)
        {
            String s = list.get(i);
            if (i<m){
                res1.add(list.get(i));
                i++;
            } else {
                res2.add(list.get(i));
                i++;
            }
        } for (String s: res2) System.out.println(s);
         for (String s: res1) System.out.println(s);
    }
}
