package com.company;

import java.util.*;

public class Main {

    public static void printMap(Map<Integer, Integer> map) {

        for (Map.Entry e:map.entrySet() ) {
            System.out.println("число " + e.getKey()+ " выпало "+e.getValue() + " раз(a)");
        }

    }

    public static void main(String[] args) {


        //Дан список Integer, каждое значение число от 1 до 12 (результат броска двух игральных костей). В результате работы программы,
        //необходимо сформировать отчет, сколько раз выпало каждое ччисло. Вывести результат в порядке возрастания.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(11);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(7);

        Collections.sort(list);

        Map<Integer,Integer> map = new HashMap<>();

        for (int i:  list) {
            //System.out.println(i);

            if (map.containsKey(i)==false) {
                map.put(i,1);
            }
            else {
                int val = map.get(i);
                map.put(i,val+1);
            }
        }

        printMap(map);



    }
}
