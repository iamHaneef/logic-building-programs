package Beginner_Interview_Question;
public class Permutation {
    public static String permutation(String str , String result) {

        if(str.length() == 0 )
        {
            System.out.println(result);
        }
        for(int i=0 ; i<str.length() ; i++)
        {
            char c = str.charAt(i);
            String remaining = str.substring(0,i) + str.substring(i+1);
            permutation( remaining  ,  result + c  );
        }
        return result ;
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutation(str, "");
    }
}