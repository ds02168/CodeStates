package JAVA_Effective;
enum Seasons2 {SPRING, SUMMER, FALL, WINTER}

public class EnumExample3 {
    public static void main(String[] args) {
        Seasons2 seasons = Seasons2.FALL;

        switch(seasons){
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
    }
}
