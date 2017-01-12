package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       HashMap<String, String> map = new HashMap<String, String>();
       map.put("фамилия1", "имя1");
       map.put("фамилия2", "имя2");
       map.put("фамилия3", "имя3");
       map.put("фамилия4", "имя4");
       map.put("фамилия5", "имя");
       map.put("фамилия6", "имя");
       map.put("фамилия7", "имя");
       map.put("фамилия8", "имя8");
       map.put("фамилия9", "имя9");
       map.put("фамилия10", "имя10");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> list = new ArrayList<String>(map.values());
        HashSet<String> set = new HashSet<String>();

        for(String s:list){
            if(set.contains(s)){
                removeItemFromMapByValue(map,s);
            } else {
                set.add(s);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
