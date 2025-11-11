package Previous_Practise_Code;

import java.util.Arrays;

public class GeneralSorting {

    public static int[] sort(int[] arr)
    {

        for(int i=0;i< arr.length-1 ; i++)
        {
            for(int j=i+1 ; j< arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args)
    {
        //GENERAL SORTING:
        int[] arr={21,5,10,2,1};
        int[] result=sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
