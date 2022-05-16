package JAVA_OOP_Extend;

class Person2{
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.setName("아무사람");
        p.setAge(28);
        p.setId(5);

        String name = p.getName();
        System.out.println("근로자의 이름은 " + name);
        int age = p.getAge();
        System.out.println("근로자의 나이는 " + age);
        int id = p.getId();
        System.out.println("근로자의 ID는 " + id);
    }
}
