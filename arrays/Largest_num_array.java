package Beginner_Interview_Question;

import java.util.Arrays;

public class Largest_num_array {

    public static int check(int[] arr)
    {
        int max = -1;

        for (int i=0 ; i< arr.length ; i++)
        {
            //max = Math.max(max,arr[i]); // 1 line solution
           if(max < arr[i])
           {
               max = arr[i];
           }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int []arr = {3,5,12,8,54,1,9,6};
        System.out.println(check(arr));

        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j = i ;j<n;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest num in array is " + arr[n-1]);
    }


}
