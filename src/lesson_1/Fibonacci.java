package lesson_1;

public class Fibonacci {
    static void printFibonacciNumbers(int quantity){
        int i = 0;
        int previous1 = 0;
        int previous2 = 1;
        int current;

        System.out.println(previous1);
        System.out.println(previous2);

        while(i < quantity-2){
            current = previous1 + previous2;
            System.out.println(current);

            previous1 = previous2;
            previous2 = current;
            i++;
        }

    }

    public static void main(String [] args){
        printFibonacciNumbers(22);
    }
}
