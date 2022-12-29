package hillel_pro.lesson04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int countOccurance(List<String> list, String stringToCount){
        int count = 0;
        //While I don't know Exceptions check argument for null
        if (stringToCount == null) return -1;
        for (String s: list) {
            if (stringToCount.equals(s)) count++;
        }
        return count;
    }

    public List toList(Object[] array){
        //TODO start and finish it later
        return null;
    }

    public List findUnique(List<Integer> listOfInt){
        //TODO start and finish it later
        return null;
    }

    public void calcOccurance(List<String> listOfString){
        //TODO start and finish it later
    }

    public static void main(String[] args) {
        List<String> stringTest = new ArrayList<>();
        stringTest.add("hi");
        stringTest.add("hi");
        stringTest.add("hello");
        stringTest.add("hi");
        stringTest.add("Hi");
        stringTest.add("hi");
        stringTest.add("Hi");
        stringTest.add("hello");
        stringTest.add("hello");
        stringTest.add("hi");
        stringTest.add("hi");
        stringTest.add("hello");
        stringTest.add("hi");
        stringTest.add("hi");
        stringTest.add("hello");
        stringTest.add("hello");
        stringTest.add("a");
        System.out.println(countOccurance(stringTest, "hi"));
    }

}

