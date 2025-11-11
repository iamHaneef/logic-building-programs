package Beginner_Interview_Question;

public class Sum_of_digit_in_a_Number {

    public static int check(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;

        }
        return sum;

    }

    public static void main(String[] args)
    {
        int num = 1234;
        int ans = check(num);
        System.out.println("The sum of the digit is "+ ans);
    }

}

