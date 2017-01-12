package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = arr.length-1; i > 0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        maximum = arr[0];
        System.out.println(maximum);
    }
}
