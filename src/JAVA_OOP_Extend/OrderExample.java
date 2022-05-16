package JAVA_OOP_Extend;

interface Customer2{
    String getOrder();
}

class CafeCustomerA implements Customer2{
    public String getOrder(){
        return "a glass of iced americano";
    }
}

class CafeCustomerB implements Customer2{
    public String getOrder(){
        return "a glass of strawberry latte";
    }
}

class CafeOwner{
    public void giveItem(Customer2 customer){ 
        System.out.println("Item : " + customer.getOrder());
    }
}

public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeowner = new CafeOwner();
        Customer2 cafeCustomerA = new CafeCustomerA();
        Customer2 cafeCustomerB = new CafeCustomerB();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}
