package JAVA_OOP_Extend;

class Coffee{ //상위 클래스
    int price;

    public Coffee(int price){
        this.price = price; //가격
    }
}

class Americano extends Coffee{ //하위 클래스
    public Americano(){
        super(4000); //가격은 4000원
    }

    public String toString(){return "아메리카노";} //Object.toString() 오버라이딩
}

class CaffeLatte extends Coffee{ //하위 클래스
    public CaffeLatte(){
        super(5000); //가격은 5000원
    }

    public String toString() {return "카페라떼";}; //Object.toString() 오버라이딩
}

class Customer{
    int money = 50000; //초기 잔액

    void buyCoffee(Coffee coffee){ //아메리카노가 인자로 주어지든 카페라떼가 인자로 주어지든
        //Coffee 타입으로 자동으로 형변환(업캐스팅)
        if(money < coffee.price){ //남은 돈 < 커피 가격
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price; //커피 가격을 뺌
        //상위 클래스에 price멤버가 존재하므로 하위클래스들은 price멤버에 접근 가능합니다
        System.out.println(coffee + "를 구입했습니다.");
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano()); //생성한 객체를 인자로 넘깁니다.
        customer.buyCoffee(new CaffeLatte()); //생성한 객체를 인자로 넘깁니다.

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}
