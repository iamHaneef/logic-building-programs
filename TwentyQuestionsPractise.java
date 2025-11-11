package Previous_Practise_Code;
import java.util.Arrays;

public class TwentyQuestionsPractise{

 /*   public static void sorting(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Insertion Sort");
        int[] arr={22,4,49,1,3};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

*/
  //  ------------------------------------------------------
    //REVERSE A STRING

   /*

public static String reverse(String str)
    {
        char[] store=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=store.length-1;i>=0;i--)
        {
            sb.append(store[i]);
        }
        return sb.toString();

    }
    public static void main(String[] args)
    {
        String str="muba";
        System.out.print(reverse(str));
    }

    */

    //-------------------------------------------------------------
    //SWAP TWO NUM


  /*  public static void swapWith(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a ="+a);
        System.out.println("b ="+b);


    }
    public static void swapWithout(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("without method--> a="+a);
        System.out.println("without method--> b="+b);

    }
    public static void main(String[] args)
    {
        int a=10,b=20;
        swapWith(a,b);

        swapWithout(a,b);
    }*/

    //------------------------------------------------------------
    //VOWELS IS PRESENT OR NOT

  /*
  public static void vowelCheck(String str)
    {
        char[] convert=str.toCharArray();
        for(char c:convert)
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                System.out.println(c +" is a vowels");
            }
        }

    }
    public static void main(String[] args)
    {
        String str="apple";
        vowelCheck(str);
    }

*/
    //---------------------------------------------------
    //prime number


/*
public static boolean checkPrime(int n)
    {
        if (n==0 || n==1)
        {
          return false;
        }

            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n % i == 0)
                {
                    return false;
                }
            }

        return true;
    }
    public static void main(String[] args)
    {
        int n=3;
        System.out.println(checkPrime(n));
    }
*/
    //-----------------------------------------------------------
    // fibanocci Series

    //recursion

/*

    public static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
*/

//------------------------------------------------------------

    //remove duplicates in a given string

   /* public static String removeDuplicate(String str)
    {
        StringBuilder sb=new StringBuilder();
        int n= str.length();
        char[] check=str.toCharArray();
        for(int i=1;i< check.length;i++)
        {
            if(check[i] != check[i-1])
            {
                sb.append(check[i-1]);
            }
            else{
                continue;
            }
        }
        sb.append(check[n-1]);

        return sb.toString();

    }

    public static void main(String[] args)
    {
        String str="haneef";
        System.out.println(removeDuplicate(str));
    }

    */
   public static String removeDuplicate(String str)
   {
       StringBuilder sb=new StringBuilder();
       int n= str.length();
       char[] check=str.toCharArray();
       char[] ans = new char[str.length()]; // temporary check
       int j=1;
       ans[0] = check[0];
       for(int i=1;i< check.length;i++)
       {
           if(j==1 || check[i] != ans[j-2] )
           {
               ans[j] = check[i];
               j++;
           }

       }
        for(char c : ans)
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }

        }


       return sb.toString();

   }

    public static void main(String[] args)
    {
        String str="hhhaannneefff";
        System.out.println(removeDuplicate(str));
    }


   //-----------------------------------------------
    //factorial
/*    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args)
    {
        int n=10;
        System.out.println(factorial(n));

    }*/
    //----------------------------------

  //odd or even number
  /*  public static void check(int n)
    {
        if(n%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String [] args)
    {
        int n=7;
        check(n);
    }*/
//------------------------------------------------

//
/*    public static int rotate(int num)
    {

        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        int num=123;
        System.out.println(rotate(num));
    }

*/

    //----------------------------------------
    //count no of digits
   /* public static int count(int num)
    {
        int  length=0;
        while(num>0)
        {
            length++;
            num=num/10;
        }
        return length;
    }
    public static void main(String[] args)
    {
        int num=2004;
        System.out.println(count(num));
    }

*/
    //---------------------------------------------






}
