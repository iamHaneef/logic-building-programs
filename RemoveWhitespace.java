package Previous_Practise_Code;

public class RemoveWhitespace {
    public static void main(String[] args)
    {

        String input="    wel   come m    y d ear fri    en   d";

        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray())
        {
            if(!Character.isWhitespace(c))
            {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
}
//       int check[]={3,5,1,18,4};
//        Arrays.sort(check);
//        System.out.println(Arrays.toString(check));