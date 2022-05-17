package JAVA_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Javascript");
        set.add("C++");
        set.add("Kotlin");
        set.add("Ruby");
        set.add("Java");

        Iterator<String> it = set.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
