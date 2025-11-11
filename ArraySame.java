package Previous_Practise_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 print : System.out.println("hi");
 Scanner
 datatype - int,string,char,float
 if condition if , else
 loop : for , while ------, foreach
 switch
 try{ +ve } -- catch {-ve }

 DSA:
 linear - Array ,stack , queue , linkedList
  non linnear - Tree , graph
 */


public class ArraySame {
    public static void main(String[] args)
    {
       int a[]={5,65,12,6,6};
       int b[]={5,6,12,8,65};

        int count = check(a,b);
        if(count == 0)
        {
            System.out.println("Array is same");
        }
        else{
            System.out.println("Array is different");
        }

       // System.out.println(same(a,b));

    }

    public static int check(int[] a , int[] b)
    {

        HashMap<Integer , Integer > map = new HashMap<>();
        int count = 0;
        if(a.length != b.length)
        {
            return -1;
        }

        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++)
        {
            if(!map.containsKey(b[i]))
            {
                return -1;
            }
            else if(map.containsKey(b[i]) && map.get(b[i]) > 0) {
                map.put(b[i],map.get(b[i])-1);
            }
        }

        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]) || map.get(a[i]) != 0)
            {
                return -1;
            }
            else if(map.containsKey(a[i]) && map.get(a[i]) == 0)
            {
                count = count + map.get(a[i]);
            }
        }
        return count;
        // easy method

        /*HashMap <Integer , Integer> map1 = new HashMap<>();
        HashMap <Integer , Integer> map2 = new HashMap<>();

        if(a.length != b.length)
        {
            return -1;
        }

        for(int i=0 ; i<a.length ; i++)
        {
            map1.put(a[i], map1.getOrDefault(a[i],0)+1);
        }

        for(int i=0 ; i<b.length ; i++)
        {
            map2.put(b[i], map2.getOrDefault(b[i],0)+1);
        }

        if(map1.equals(map2))
        {
            return 1;
        }

        return -1; */



    }
/*
    public static boolean same(Object arr1[],Object arr2[]) {

        Set<Object> Unique1 = new HashSet<>(Arrays.asList(arr1));
        Set<Object> Unique2 = new HashSet<>(Arrays.asList(arr2));
        if (Unique1.size() != Unique2.size()) {
            return false;
        }
        for (Object one : Unique1) {
           if(Unique2.contains(one))

               return true;


        }
    return false;
    }*/
}
