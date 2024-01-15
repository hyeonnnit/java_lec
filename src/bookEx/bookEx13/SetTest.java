package bookEx.bookEx13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);
        if (set.contains("Ham")){
            System.out.println("Ham도 포함");
        }

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2,4,6,8));

        s1.retainAll(s2);
        System.out.println(s1);
    }
}
