package com.javarush.test.level08.lesson11.home09;

import java.util.Date;



/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
 если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date currentDate = new Date(date);
        Date startYear = new Date();
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        startYear.setDate(1);
        startYear.setMonth(0);
        long dist = currentDate.getTime()-startYear.getTime();
        long day = 24*60*60*1000;
        int dayY = (int)(dist/day);
        return (dayY%2!=0);
    }
}
