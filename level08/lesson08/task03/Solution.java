package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Popov", "Pop");
        map.put("Ivanov", "12");
        map.put("Sidorov", "13");
        map.put("Pisun", "14");
        map.put("Tet", "15");
        map.put("Test", "16");
        map.put("qwerty", "17");
        map.put("qwerty14", "18");
        map.put("qwerty15", "19");
        map.put("qwerty16", "20");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            String s = pair.getValue();
            if (s.equals(name)) count++;
        }
    return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            String s = pair.getKey();
            if (s.equals(lastName)) count++;
        }
        return count;

    }
}
