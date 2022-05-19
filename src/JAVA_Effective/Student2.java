package JAVA_Effective;

public class Student2 {
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student2(String name, int score, Gender gender) {
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}
