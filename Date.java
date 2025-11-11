package Previous_Practise_Code;

import java.text.SimpleDateFormat;

public class Date
{
    public static void main(String[ ] args)
    {

        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String ans = sdf.format(new java.util.Date());
        System.out.println(ans);

    }
}
