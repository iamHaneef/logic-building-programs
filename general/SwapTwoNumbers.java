package Beginner_Interview_Question;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(" a is " + a);
        System.out.println(" b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a is " + a);
        System.out.println(" b is " + b);

    }
}
