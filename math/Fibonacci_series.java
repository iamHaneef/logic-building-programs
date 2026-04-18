package Beginner_Interview_Question;


import java.util.Arrays;

public class Fibonacci_series {

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        int n = 10;
        int[] result1 = new int[n];

        // fibonacci using recurion
        int m=0;
        for(int i=0 ; i<n ;i++)
        {
            result1[m++] = fibonacci(i);
        }
        System.out.println(Arrays.toString(result1));

        // without recusion

        int num = 10;

        int a = 0 ;
        int b = 1;
        System.out.println("without Recusion : ");
        System.out.print(a + " " + b + " ");

        for(int i=2 ; i<num ; i++)
        {
            int c = a+b;
            System.out.print(c + " ");

            a = b;
            b = c;

        }



    }


}
