package Previous_Practise_Code;

import java.util.HashMap;

public class twentyquestionspart2 {
    // count of each char in string
    /*
     * public static int count(String str)
     * {
     * int length=0;
     * char check[]=str.toCharArray();
     * for(char ch:check)
     * {
     * length++;
     * }
     * 
     * return length;
     * }
     * 
     * public static void main(String[] args)
     * {
     * String str="haneef";
     * System.out.println(count(str));;
     * }
     */

    // ---------------------------------------

    // reverse array

    /*
     * public static String reverse(int[] original)
     * {
     * int[] rotate=new int[original.length];
     * int n=original.length;
     * int j=0;
     * for(int i=n-1;i>=0;i--)
     * {
     * rotate[j++]=original[i];
     * }
     * return Arrays.toString(rotate);
     * }
     * public static void main(String[] args)
     * {
     * int[] original={1,2,3,4,5,6};
     * System.out.println(reverse(original));
     * }
     * 
     */

    // ---------------------------------------------

    // sum of digits
    /*
     * public static int rotate(int num)
     * {
     * 
     * int sum=0;
     * while(num>0)
     * {
     * int digit=num%10;
     * sum=sum+digit;
     * num=num/10;
     * }
     * 
     * return sum;
     * }
     * 
     * public static void main(String[] args)
     * {
     * int num=12345;
     * System.out.println(rotate(num));
     * }
     */

    // -----------------------------------

    // remove duplicate in the array

    /*
     * public static String process(char[] check)
     * {
     * 
     * StringBuilder sb=new StringBuilder();
     * for(int i=0;i< check.length;i++)
     * {
     * int j;
     * for( j=0;j< check.length;j++)
     * {
     * if(check[i]==check[j])
     * {
     * break;
     * }
     * }
     * 
     * if(j==i)
     * {
     * sb.append(check[i]);
     * }
     * }
     * return sb.toString();
     * 
     * }
     * 
     * public static void main(String[] main)
     * {
     * //System.out.println("hello");
     * char[] check={'h','a','n','e','e','f'};
     * System.out.println(process(check));
     * }
     */

    // --------------sb-------------------------------------

    // count of each character in string
    /*
     * public static int count(String str)
     * {
     * int letters=0;
     * char[] arr=str.toCharArray();
     * for(char c :arr)
     * {
     * letters++;
     * }
     * return letters;
     * }
     * 
     * public static void main(String[] args)
     * {
     * String str="haneef i";
     * System.out.println(count(str));
     * }
     */

    // --------------------------------------------

    // remove duplicate in a string
    public static String process(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                sb.append(str.charAt(i));
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map.keySet());
        return sb.toString();
    }

    public static void main(String[] main) {
        String str = "geeksforgeeks";
        System.out.println(process(str));
    }

    // ------------------------------------------

    /*
     * 
     * //remove duplicate in array
     * 
     * public static String process(char[] check)
     * {
     * int n=check.length;
     * int index=0
     * for(int i=0;i<n;i++)
     * {
     * int j;
     * for( j=0;j<i;j++)
     * {
     * if(check[i] == check[j])
     * {
     * break;
     * }
     * }
     * 
     * if(j==i)
     * {
     * check[index++]=check[i];
     * }
     * }
     * return String.valueOf(Arrays.copyOf(check, index));
     * }
     * public static void main(String[] args)
     * {
     * char[] check={'h','a','n','e','e','f'};
     * System.out.println(process(check));
     * }
     * 
     */

    // -------------------------------------------------
    // ARMSTRONG

    /*
     * public static boolean process(int n,int length)
     * {
     * int original=n;
     * int power=0;
     * int sum=0;
     * while(n>0)
     * {
     * int digit=n%10;
     * power=calculate_power(digit,length);
     * sum=sum+power;
     * n=n/10;
     * }
     * if(sum==original)
     * {
     * return true;
     * }
     * return false;
     * }
     * public static int calculate_polwer(int N,int P)
     * {
     * if(P==0)
     * {
     * return 1;
     * }
     * 
     * return N*calculate_power(N,P-1);
     * }
     * 
     * public static void main(String[] args)
     * {
     * int n=163;
     * String change=String.valueOf(n);
     * System.out.println(process(n, change.length()));
     * }
     */

    // -------------------------------------------------
    // reverse each word in a string

    /*
     * public static String process(String str)
     * {
     * StringBuilder sb=new StringBuilder();
     * String[] divide=str.split(" ");
     * for(String word:divide)
     * {
     * char[] subString=word.toCharArray();
     * int n=subString.length;
     * for(int i=n-1;i>=0;i--)
     * {
     * sb.append(subString[i]);
     * }
     * sb.append(" ");
     * }
     * return sb.toString();
     * }
     * 
     * public static void main(String[] args)
     * {
     * String str="hello world";
     * System.out.println(process(str));
     * }
     * 
     */
    // ------------------------------------------
    // first occurance of a substring

    /*
     * public static int process(String str,String SubString)
     * {
     * int check=str.indexOf(SubString);
     * 
     * return check;
     * }
     * 
     * public static void main(String[] args)
     * {
     * String str="hello World";
     * String subStr=" Wor";
     * 
     * System.out.println(process(str,subStr));
     * }
     * 
     */
    // ------------------------------------------------
    // pyramid pattern
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("PYRAMID");
     * int n=7;
     * for(int i=0;i<n;i++)
     * {
     * for(int j=0;j<n-i;j++)
     * {
     * System.out.print(" ");
     * }
     * 
     * for(int k=0;k<2*i+1;k++)
     * {
     * 
     * System.out.print("*");
     * }
     * System.out.print("\n");
     * }
     * }
     */
    // ------------------------------------------------
    // pyramid pattern --left
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("LEFT PYRAMID");
     * int n=7;
     * for(int i=0;i<n;i++)
     * {
     * for(int j=0;j<2*n-2*i;j++)
     * {
     * System.out.print(" ");
     * }
     * 
     * for(int k=0;k<2*i+1;k++)
     * {
     * 
     * System.out.print("*");
     * }
     * System.out.print("\n");
     * }
     * }
     */
    // ------------------------------------------------
    /*
     * //pyramid pattern --right
     * public static void main(String[] args)
     * {
     * System.out.println("RIGHT PYRAMID");
     * int n=7;
     * for(int i=1;i<=n;i++)
     * {
     * for(int k=1;k<=i;k++)
     * {
     * System.out.print("* ");
     * }
     * System.out.print("\n");
     * }
     * }
     * 
     */

}
