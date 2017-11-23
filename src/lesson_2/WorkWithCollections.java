package lesson_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorkWithCollections {
    private static ArrayList<String> my_array = new ArrayList<>();

    private static void setMyArray() {
        my_array.add("5th object");
        my_array.add("1st object");
        my_array.add("6th object");
        my_array.add("3rd object");
        my_array.add("2nd object");
        my_array.add("4th object");
    }

    private static void printMyArray(ArrayList<String> my_array){
        Iterator<String> i = my_array.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String [] args){
        setMyArray();

        my_array.remove("3rd object");
        System.out.println(my_array.contains("3rd object"));

        System.out.println("\nMy not sorted array - ");
        printMyArray(my_array);

        Collections.sort(my_array);

        System.out.println("\nMy sorted array - ");
        for (String s : my_array){
            System.out.println(s);
        }
    }
}
