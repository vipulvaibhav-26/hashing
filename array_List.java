import java.util.*;
public class array_List {
    public static void main(String[] args) {
    ArrayList<Integer> v=new ArrayList<>();
    v.add(0);
    v.add(3);
    v.add(6);
    System.out.println(v);
    System.out.println(v.get(1));
        v.add(1,4);
        System.out.println(v);
    System.out.println(v.set(1,2));
    System.out.println(v.size());
    System.out.println(v.remove(3));
    System.out.println(v);
    Collections.sort(v);
    System.out.println(v);
}
}
