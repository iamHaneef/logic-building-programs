package Beginner_Interview_Question;

import java.util.Arrays;

public class No_of_vowels {

    public static int check (String s)
    {
        // simple method
        String str = s.toLowerCase();
        int count = 0;

        int m=0;
        for(char c : str.toCharArray())
        {
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
            {
                System.out.println(c);
                count++;
            }
        }
        //return count

        // little hard method
        int answer=0;
        for(int i=0;i<str.length();i++)
        {
            if("aeiou".indexOf(str.charAt(i)) != -1)
            {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args)
    {
        String str = "Hello Worlds";

        int ans = check(str);
        System.out.println("count is " + ans);


    }

}
