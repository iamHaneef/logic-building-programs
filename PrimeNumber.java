package Beginner_Interview_Question;

public class PrimeNumber {

    public static boolean check(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i< Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return false; // Not a prime
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n=2;
        boolean ans = check(n);
        if(ans == true)
        {
            System.out.println(n +" is a Prime Numbers");

        }
        else{
            System.out.println(n +" Is Not a Prime Number");
        }

    }

}
