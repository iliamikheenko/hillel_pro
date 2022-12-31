package hillel_pro.lesson04;

import java.util.*;

public class Main {

    //return -1 if argument is null
    public static int countOccurrence(List<String> list, String stringToCount){
        int count = 0;
        if (stringToCount == null) return -1;
        for (String s: list) {
            if (stringToCount.equals(s)) count++;
        }
        return count;
    }

    public static List<?> toImmutableList(Object[] array){
        return List.of(array);
    }

    public static List<?> toMutableList(Object[] array){
        return new ArrayList<>(List.of(array));
    }

    //return new ArrayList, order of elements can differ
    //also possible to use loop, new empty List and contains method to save order
    public static ArrayList<Integer> findUnique(ArrayList<Integer> numbers){
        HashSet<Integer> setUniqueInt = new HashSet<>(numbers);
        return new ArrayList<>(setUniqueInt);
    }

    public static void calcOccurrence(List<String> list){
        HashMap<String,Integer> listOfOccurrence = new HashMap<>();
        for (String s: list) {
            if (listOfOccurrence.containsKey(s)) {
                listOfOccurrence.put(s, listOfOccurrence.get(s) + 1);
            } else {
                listOfOccurrence.put(s, 1);
            }
        }
        for (Map.Entry<String,Integer> m:listOfOccurrence.entrySet()){
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }

    //In fact the same decision as calcOccurrence method, but it returns HashMap
    public static HashMap<String,Integer> findOccurrence(List<String> listOfString){
        HashMap<String,Integer> mapOfOccurrence = new HashMap<>();
        for (String s: listOfString) {
            if (mapOfOccurrence.containsKey(s)) {
                mapOfOccurrence.put(s, mapOfOccurrence.get(s) + 1);
            } else {
                mapOfOccurrence.put(s, 1);
            }
        }
        return mapOfOccurrence;
    }
}


