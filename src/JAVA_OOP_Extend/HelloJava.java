package JAVA_OOP_Extend;
//상위 클래스
class Person{
    String name;
    int age;

    void learn(){
        System.out.println("공부를 합니다.");
    }
    void walk(){
        System.out.println("걷습니다.");
    }
    void eat(){
        System.out.println("밥을 먹습니다.");
    }
}
//하위클래스, Person으로부터 상속
class Programmer extends Person{
    String companyName;

    void coding(){
        System.out.println("코딩을 합니다.");
    }
}
//하위클래스, Person으로부터 상속
class Dancer extends Person{
    String groupName;

    void dancing(){
        System.out.println("춤을 춥니다.");
    };
}
//하위클래스, Person으로부터 상속
class Singer extends Person{
    String bandName;

    void singing(){
        System.out.println("노래합니다.");
    };
    void playGuitar(){
        System.out.println("기타를 칩니다.");
    };
}
public class HelloJava {
    public static void main(String[] args) {
        //Person
        Person p = new Person();
        p.name = "이사람";
        p.age = 28;
        System.out.println(p.name);
        System.out.println(p.age);
        p.learn();
        p.eat();
        p.walk();


        //Programmer
        Programmer pg = new Programmer();
        //Person 멤버 상속
        pg.name = "김개발";
        pg.age = 26;
        System.out.println(pg.name);
        System.out.println(pg.age);
        pg.learn();
        pg.eat();
        pg.walk();
        //Programmer 멤버
        pg.companyName = "네카라쿠배당토";
        System.out.println(pg.companyName);
        pg.coding();


        //Dancer
        Dancer dc = new Dancer();
        //Person 멤버 상속
        pg.name = "박댄서";
        pg.age = 23;
        System.out.println(pg.name);
        System.out.println(pg.age);
        pg.learn();
        pg.eat();
        pg.walk();
        //Dancer 멤버
        dc.groupName = "JYPSMYG";
        System.out.println(dc.groupName);
        dc.dancing();


        //Singer
        Singer sg = new Singer();
        //Person 멤버 상속
        pg.name = "최가수";
        pg.age = 32;
        System.out.println(pg.name);
        System.out.println(pg.age);
        pg.learn();
        pg.eat();
        pg.walk();
        //Singer 멤버
        sg.bandName = "버스킹";
        System.out.println(sg.bandName);
        sg.playGuitar();
        sg.singing();

    }
}
