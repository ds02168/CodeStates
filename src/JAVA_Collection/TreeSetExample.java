package JAVA_Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();

        workers.add("이 자바");
        workers.add("박 헤커");
        workers.add("김 코딩");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("이"));
        System.out.println(workers.subSet("김","박"));
    }
}
