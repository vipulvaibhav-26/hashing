import java.util.HashSet;
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> v=new HashSet<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(1);
        if(v.contains(1));
        System.out.println("element is present");
        if(!(v.contains(6)))
        System.out.println( "element is not present");
        v.remove(3);
        System.out.println("Size of the set is:"+v.size());
       v.add(5);
       v.add(6);
        System.out.println(v);

    }
}