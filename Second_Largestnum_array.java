package Beginner_Interview_Question;

import java.util.Arrays;

public class Second_Largestnum_array {

    public static int check(int[] arr)
    {
        int first = -1;
        int second = -1;
        int third = -1;


        for (int i=0 ; i< arr.length ; i++)
        {
            if(first < arr[i])
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else if( second < arr[i]  && first > arr[i])
            {
                third = second;
                second = arr[i];
            }
            else if(third < arr[i] &&  second > arr[i] &&  first > arr[i])
            {
                third = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        return third;
    }

    public static void main(String[] args)
    {
        int []arr = {3,5,12,8,1};
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

        System.out.println("1st Largest num in array is "+ arr[n-1]);
        System.out.println("2nd Largest num in array is " + arr[n-2]);


    }


}
