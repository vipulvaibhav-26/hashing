import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector vec = new Vector(3,2);
        vec.addElement(2);
        vec.addElement(3);
        vec.addElement(3.4);
        System.out.println("Vector: " + vec);
        
        int index = vec.indexOf(3);
        System.out.println(index);
        vec.addElement("Vipul");
        vec.insertElementAt(1,3);
        System.out.println(vec);
    }
}
