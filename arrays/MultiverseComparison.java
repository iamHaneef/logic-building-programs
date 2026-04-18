package Previous_Practise_Code;

import java.util.Arrays;

public class MultiverseComparison {

    public static int[] process(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[arr.length];

        for(int i =0 ;i<n ; i++)
        {
            int first = count(arr[i]);
            result[i] = -1;
            for(int j=i+1 ; j<n ; j++)
            {
                int second = count(arr[j]);

                if(first == second && arr[i] < arr[j])
                {
                    result[i] = arr[j];
                    break;
                }
                else if(first < second)
                {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    public static int count(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int digit = n%10;
            sum = sum + digit;
            n = n/10;

        }
        return sum;
    }


    public static void main(String[] args)
    {
        int[] given={9,72,45,19,19,99,1001,4};
        int[] ans =  process(given);
        System.out.println(Arrays.toString(ans));

    }
}
