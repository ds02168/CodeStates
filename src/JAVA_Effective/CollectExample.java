package JAVA_Effective;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student2> totalList = Arrays.asList(
                new Student2("김코딩", 10, Student2.Gender.Male),
                new Student2("김인기", 8, Student2.Gender.Male),
                new Student2("이자바", 9, Student2.Gender.Female),
                new Student2("최민선", 10, Student2.Gender.Female)
        );

        List<Student2> maleList = totalList.stream()
                .filter(s -> s.getGender() == Student2.Gender.Male)
                .collect(Collectors.toList());

        maleList.stream().forEach(n-> System.out.println(n.getName()));

        Set<Student2> femaleSet = totalList.stream()
                .filter(s -> s.getGender() == Student2.Gender.Female)
                .collect(Collectors.toCollection(HashSet:: new));

        femaleSet.stream().forEach(n-> System.out.println(n.getName()));
    }
}
