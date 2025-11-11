package Previous_Practise_Code;

public class ReverseAlphabetMatch {

    public static boolean isPalindromicAlphabetMatch(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0 ; i<n/2 ; i++)
        {
            char left = s.charAt(i); // 97
            char right = s.charAt(n-1-i); // 122
            char reverse = (char) ('z' - (left -  'a'));

            if(right != reverse)
            {
                System.out.println(count);
                return false;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
        return true;

    }

    public static void main(String[] args) {
        String s = "abcxyz"; // try with "abcyz" too

        if (isPalindromicAlphabetMatch(s)) {
            System.out.println(s + " is a VALID palindromic alphabet match.");
        } else {
            System.out.println(s + " is NOT a valid palindromic alphabet match.");
        }
    }
}
