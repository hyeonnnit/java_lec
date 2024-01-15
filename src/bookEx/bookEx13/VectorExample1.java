package bookEx.bookEx13;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>(2);
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        System.out.println("Vector Size: "+ vec.size());
        Collections.sort(vec);
        for (String s: vec){
            System.out.print(s+" ");
        }
    }
}
