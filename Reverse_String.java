package Beginner_Interview_Question;

public class Reverse_String {

    public static String check(String s)
    {
        //
        char c[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String res = "";
        for(int i=s.length()-1 ; i>=0 ;i--)
        {
            sb.append(s.charAt(i));
            // res = res + s.charAt(i);
        }

        return sb.toString();
        //return new StringBuilder(s).reverse().toString();  easy way

    }

    public static void main(String[] args)
    {
        String str = "Haneef";

        System.out.println(check(str));
    }

}
