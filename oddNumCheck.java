package Previous_Practise_Code;

import java.util.ArrayList;
import java.util.List;

public class oddNumCheck {
    public static void main(String[] args)
    {
        int[] arr={2,4,6,7,9};
        List<Integer> list = new ArrayList<>();

        for(int  num : arr)
        {
            if(num % 2 ==0)
            {
                System.out.println(num +" is Not a odd number");
            }else{
                list.add(num);
            }
        }

        System.out.println(list);
        System.out.println("Have a odd num");
    }

}
