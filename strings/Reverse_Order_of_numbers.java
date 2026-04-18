package Beginner_Interview_Question;

public class Reverse_Order_of_numbers {

    public static String check(String s)
    {
        String[] cut = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int n = cut.length;
       // String  result = "";

        for(int i=0 ; i<n ; i++)
        {
            String word = cut[i];

            char c[] = word.toCharArray();
            //String reverse="";
            for(int j=c.length-1 ; j>=0 ;j--)
            {
                sb.append(c[j]);
               // reverse = reverse + word.charAt(j);
            }
            sb.append(" ");
            //result = result + reverse + " ";
        }
        return sb.toString().trim();
        //return result;
    }

    public static void main(String[] args)
    {
        String str = "Java Is Fun";

        System.out.println(check(str));
    }

}
