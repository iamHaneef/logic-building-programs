package Beginner_Interview_Question;

public class Gcd_of_twoNumbers {

    public static int gcd(int a , int b)
    {
        if(b == 0)
        {
            return a;
        }

        return gcd( b , a % b); // tail recursion
    }

    public static void main(String[] args)
    {
        int a = 66;
        int b = 42;

        System.out.println(gcd(a,b));

    }









}
