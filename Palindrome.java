package Beginner_Interview_Question;

public class Palindrome {

    public static boolean check(String str)
    {
        //lowercase

        String strs = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        //remove empty space
        for(int i=0;i<strs.length();i++)
        {
            if( Character.isLetterOrDigit(strs.charAt(i)) )
            {
                sb.append(strs.charAt(i));
            }
        }
        //palindrome check
        String finals = sb.toString();
        int n = finals.length();

        for(int i =0;i<n/2 ; i++)
        {
            if(finals.charAt(i) != finals.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;


    }
    public static boolean num_check(int num)
    {

        int original = num;
        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum = sum * 10 + digit;
            num = num / 10;

        }
        if(sum == original)
        {
            return true;
        }
        return false;


    }
    public static void main(String[] args)
    {

        String str= "IsMalaya lams I";
        int num = 10021;
        System.out.println(num + " is " + num_check(num));
        System.out.println(str + " is " + check(str));



    }

}
