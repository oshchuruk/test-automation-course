import java.util.ArrayList;
import java.util.HashSet;


public class ConvertListToSet
{
    public static void main( String[] args )
    {
        System.out.println("List values .....");
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");

        for (String temp : list){
            System.out.println(temp);
        }

        HashSet<String> set = new HashSet<>(list);

        System.out.println("Set values .....");
        System.out.println(set);
        System.out.println(list);
        for (String temp : set){
            System.out.println(temp);
        }

        ArrayList<String> newlist = new ArrayList<>(set);
        newlist.add("wowowowowowoowow");
        System.out.println(newlist);
    }
}