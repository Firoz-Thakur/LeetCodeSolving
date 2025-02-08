package org.problems;

import java.util.ArrayList;
import java.util.List;

public class test {


    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(23);
        ar.add(18);
        ar.add(55);
        ar.add(44);
        ar.add(33);
        ar.add(45);
        ar.add(59);
        ar.add(11);
        findHours(ar);
    }
//    23 18 55 44 33 45 59  11
//
//            23 18 44 33 11
//
//            23 18 33 11
//
//            23 18 11 ,- 3
//    23 18 55 44 33 45 59 11

    public static void findHours(List<Integer>  ar)
    {
//        ArrayList<Integer> ar1= new ArrayList<>(ar);
        int size = ar.size();
        int count=0;
        List<Integer> list2 = new ArrayList();
        int time=0;
        while(true) {
            int flag=0;
            size = ar.size();
            for (int i = 1; i < size - 1; i++) {
                if (ar.get(i) > ar.get(i - 1)){
                    flag=1;
                    continue;
                } else {
                    list2.add(ar.get(i));
                }
            }
            ar.clear();
            ar.addAll(list2);
            list2.clear();
            if(flag==0)
                 break;
        }
        System.out.println(ar);
    }
}
