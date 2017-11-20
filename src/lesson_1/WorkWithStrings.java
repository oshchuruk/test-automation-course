package lesson_1;

public class WorkWithStrings {

    public static void main(String [] args){
        String target_text = "A wonderful serenity has taken possession of my entire soul, like these sweet mornings " +
                "of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot," +
                " which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the " +
                "exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing" +
                " a single stroke at the present moment; and yet I feel that I never was a greater artist than now.";

        String target_text_for_trim = "       A wonderful serenity has taken possession of my entire soul, like these sweet mornings " +
                "of spring which I enjoy with my whole heart.       ";

        String concat_text = " I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth," +
                " a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks," +
                " and grow familiar with the countless indescribable forms of the insects and flies, then I feel the presence " +
                "of the Almighty, who formed us in his own image, and the breath of that universal love which bears and" +
                " sustains us, as it floats around us in an eternity of bliss; and then, my friend, when darkness overspreads " +
                "my eyes, and heaven and earth seem to dwell in my soul and absorb its power, like the form of a beloved mistress," +
                " then I often think with longing.";


        System.out.println("Target string length -");
        System.out.println(target_text.length());

        System.out.println("\nTurn target string to lower case and compare result with target  -");
        String target_lower = target_text.toLowerCase();
        System.out.println(target_lower);
        System.out.println(target_text.equals(target_lower));
        System.out.println(target_text.equalsIgnoreCase(target_lower));

        System.out.println("\nTurn target string to upper case and compare result with target  -");
        String target_upper = target_text.toUpperCase();
        System.out.println(target_upper);
        System.out.println(target_text.equals(target_upper));
        System.out.println(target_text.equalsIgnoreCase(target_upper));

        System.out.println("\nTrim a string with a lot of spaces and get its length  -");
        System.out.println(target_text_for_trim.trim());
        System.out.println(target_text_for_trim.trim().length());

        System.out.println("\nReplace all dots with exclamation signs  -");
        System.out.println(target_text.replace('.', '!'));

        System.out.println("\nConcatenate target string with a next sentence  -");
        System.out.println(target_text.concat(concat_text));

        System.out.println("\nCheck if a string starts with defined substrings  -");
        System.out.println(target_text.startsWith("A wonderful"));
        System.out.println(concat_text.startsWith("I throw"));

        System.out.println("\nCheck if a string ends with defined substrings  -");
        System.out.println(target_text.endsWith("than now"));
        System.out.println(concat_text.endsWith("with longing."));

//        System.out.println("\nGet all the characters and print them out  -");
//
//        char[] symbols = target_text.toCharArray();
//
//        for(char x : symbols){
//            System.out.println(x);
//        }

        System.out.println("\nGet substrings from 400th character and from 150th to 200th  -");
        System.out.println(target_text.substring(400));
        System.out.println(target_text.substring(150, 200));

        System.out.println("\nSplit target strings on sentences  -");
        String [] splits = target_text.split("\\. ");

        for (String x : splits){
            System.out.println(x);
        }

        System.out.println("\nGet 11th character  -");
        System.out.println(target_text.charAt(10));

        System.out.println("\nIndexes of character 'f' and word 'soul'  -");
        System.out.println(target_text.indexOf('f'));
        System.out.println(target_text.indexOf("soul"));

        System.out.println("\nIndexes of last appearance of character 'n' and word 'and'  -");
        System.out.println(target_text.lastIndexOf('n'));
        System.out.println(target_text.lastIndexOf("and"));

    }
}
