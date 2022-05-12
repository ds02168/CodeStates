package JAVA_OOP_Extend;

class Person2{
    //private로 선언함으로써 클래스 외부에선 접근이 불가능합니다.
    private String name;
    private int age;
    private int id;

    //public으로 getter()와 setter()를 선언함으로써 해당클래스에 접근 가능합니다.
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
        Person2 p = new Person2(); //인스턴스 생성
        //객체의 멤버는 private여서 접근 불가능하지만 setter()는 public이므로 접근가능
        p.setName("아무사람");
        p.setAge(28);
        p.setId(5);

        //getter()도 public이므로 접근가능합니다.
        String name = p.getName();
        System.out.println("근로자의 이름은 " + name);
        int age = p.getAge();
        System.out.println("근로자의 나이는 " + age);
        int id = p.getId();
        System.out.println("근로자의 ID는 " + id);
    }
}
