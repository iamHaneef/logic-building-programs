package Beginner_Interview_Question;

public class Factorial {

    public static int withoutRecursion(int n)
    {
        int result = 1;

        for(int i = 1 ; i<=n ; i++)
        {
            result = result * i;
        }
        return result;
    }

    public static int tailfactorial(int n , int result)
    {

        if(n == 1 ) // or n==0
        {
            return result;
        }
        // return n * factorial(n-1);
        return tailfactorial(n-1 , result * n);
    }
    public static int factorial(int n)
    {

        if(n == 0 || n == 1)
        {
            return 1;
        }
         return n * factorial(n-1);

    }

    public static void main(String[] args)
    {
        int n = 6;
        int result = 1;

        int ans1 = factorial(n);
        int ans2 = tailfactorial(n , result);
        int ans3 = withoutRecursion(n);
        System.out.println("Factorial of " + n + " is " + ans1);
        System.out.println("Tail_Factorial of " + n + " is " + ans2);
        System.out.println("Without recusion of " + n + " is " + ans3);

    }
}




