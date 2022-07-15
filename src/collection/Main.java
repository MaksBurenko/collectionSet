package collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(set1);
        System.out.println(set2);
        symmetricDifference(set1, set2);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> set3 = new HashSet<>(set1);

        for (T temp : set2) {

                if (set3.add(temp)) {
                } else {
                    set3.remove(temp);
                }
        }
        System.out.println(set3);
        return set3;
    }

}
