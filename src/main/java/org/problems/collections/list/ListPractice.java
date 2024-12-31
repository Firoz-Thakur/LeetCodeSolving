package org.problems.collections.list;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.binarySearch;
import static java.util.Collections.sort;


public class ListPractice {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(2);
        list.add(43);
        System.out.println(list);
      //  list.remove(43);
        list.remove(new Integer(43));
        System.out.println(list);
        list.add(1,545);
        System.out.println(list);
        list.add(0,1000);
        System.out.println(list);
        List<Object> list2 = new ArrayList<>(list);
        list.add(list2);
        System.out.println(list);
        System.out.println("contains list : "+ list.contains(list2));
        System.out.println("contains list : "+ list.contains(2));
        Object removedElement =  list.remove(0);
        System.out.println("removed element is "+ removedElement);
        list.add(545);
        System.out.println(list.indexOf(545)); //-1 else not found
        System.out.println(list.lastIndexOf(545)); // - 1 else not found
        System.out.println(list);
        list.set(2,434);
        System.out.println(list);
//        ArrayList<Integer> newList = new ArrayList<>(List.of(23, 4, 5, 65, 7, 8, 8798));
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(100,2,3,4,5,6,6));
        ArrayList<Integer> newList3 = new ArrayList<>(Arrays.asList(100,2,3,4,5,6,6));
        newList.sort((a,b)-> b - a);
        System.out.println("sorting using in build function"+ newList);
        sort(newList3);
        System.out.println("sorting using collection sort "+ newList3);

        // conversion array to list
        //fixed size with immutable
        Integer ar4[] = new Integer[]{1,3,4,6,6};
        List<Integer> list4 = Arrays.asList(ar4);

        //mutable list from array , size can also be increase
        List<Integer> list5 = new ArrayList<>(Arrays.asList(ar4));
        System.out.println(list4);
//        list4.add(4342434); //Exception in thread "main" java.lang.UnsupportedOperationException
        list5.add(23434);

        System.out.println(list5);

        //Linked list

        List<Integer> ll = new LinkedList<>(Arrays.asList(2,2323,4,4,5,4,232,434,234,6,3,532));
        System.out.println("Linked list is "+ ll);
        ll.add(1,0);
        System.out.println("updated Linked list is "+ ll);
        ll.remove(1); // index
        System.out.println("updated Linked list is "+ ll);
        list.remove(new Integer(4)); // Remove first occurrence of 3
        sort(ll);
        binarySearch(ll,242);
        System.out.println("Binary search on Linked list is "+  binarySearch(ll,0));
        System.out.println("frequency of any object in an collections" + Collections.frequency(ll,4)); //return count or 0


        //java streams

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredList = lists.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squaredList);

        // map and list

        Map<String, List<String>> classMap = new HashMap<>();

        // Add students to different classes
        classMap.put("Class A", new ArrayList<>(Arrays.asList("Alice", "Bob")));
        classMap.put("Class B", new ArrayList<>(Arrays.asList("Charlie", "David")));

        // Add a student to Class A
        classMap.get("Class A").add("Eve");
        classMap.get("Class A").add("Firoz");
        // Print the map
        for (Map.Entry<String, List<String>> entry : classMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }









    }
}
