package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i <3 ; i++)
        {
            arr[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = arr.length-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(arr[1]);

        }

    }

